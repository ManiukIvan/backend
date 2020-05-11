package backend.repository;

import backend.entity.Like;
import org.springframework.data.repository.CrudRepository;

public interface LikeRepository extends CrudRepository<Like,Long> {
}
