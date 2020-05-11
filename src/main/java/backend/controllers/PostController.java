package backend.controllers;

import backend.entity.Post;
import backend.service.PostServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class PostController {
    @Autowired
    private PostServiceImp PostServiceImp;

    @GetMapping("/posts")
    public List<Post> findAll(){
        return PostServiceImp.findAllPosts();
    }
}
