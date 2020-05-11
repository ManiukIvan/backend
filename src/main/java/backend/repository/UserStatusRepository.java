package backend.repository;

import backend.entity.UserStatus;
import org.springframework.data.repository.CrudRepository;

public interface UserStatusRepository extends CrudRepository<UserStatus,Long> {

}
