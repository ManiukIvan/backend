package backend.service;

import backend.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User saveUser(User user);
    User loginUser(User user);
    User findUserByUserName(String userName);

}
