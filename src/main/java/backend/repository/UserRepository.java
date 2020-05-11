package backend.repository;

import backend.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Long> {

    @Override
    List<User> findAll();

    User findByUserName(String userName);

    User findByLoginAndPassword(String login,String password);
    User findUserByLogin(String login);
}
