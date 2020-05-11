package backend.service;

import backend.entity.User;
import backend.exception.ApiRequestException;
import backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        //if there is no user with same userName and login
        if (userRepository.findByUserName(user.getUserName()) == null){
            if (userRepository.findUserByLogin(user.getLogin()) == null){
                userRepository.save(user);
                return loginUser(user);
            }
            else {
                throw new ApiRequestException("There is already user with login: "+user.getLogin());
            }
        }
        else {
            throw new ApiRequestException("There is already user with user name: "+user.getUserName());
        }
    }

    @Override
    public User loginUser(User user) {
        User userFromDataBase = userRepository.findByLoginAndPassword(user.getLogin(),user.getPassword());
        if (userFromDataBase != null){
            if (userFromDataBase.getUserStatus().getStatus().equals("active")) {
                return userFromDataBase;
            }
            else {
                throw new ApiRequestException("You're banned");
            }
        }
        else {
            throw new ApiRequestException("Login or password incorrect");
        }
    }

    @Override
    public User findUserByUserName(String userName) {
        User user = userRepository.findByUserName(userName);
        if (user == null){
            throw new ApiRequestException("There is no such user");
        }
        else {
            return user;
        }
    }


}
