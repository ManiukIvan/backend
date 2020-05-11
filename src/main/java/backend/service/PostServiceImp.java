package backend.service;

import backend.entity.Post;
import backend.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImp implements PostService {
    @Autowired
    private PostRepository postRepository;
    @Override
    public List<Post> findAllPosts() {
        return postRepository.findAll();
    }
}
