package backend.service;

import backend.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    List<Post> findAllPosts();
}
