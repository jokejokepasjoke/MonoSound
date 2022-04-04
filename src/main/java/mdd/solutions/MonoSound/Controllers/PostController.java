package mdd.solutions.MonoSound.Controllers;

import mdd.solutions.MonoSound.Models.Post;
import mdd.solutions.MonoSound.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/v1/post")
public class PostController {
    PostService postService;
    @Autowired
    PostController(PostService postService){
        this.postService = postService;
    }

    @GetMapping("/")
    public List<Post> getPosts(){
        return postService.getAllPosts();
    }

}
