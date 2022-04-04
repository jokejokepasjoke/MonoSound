package mdd.solutions.MonoSound.Service;

import mdd.solutions.MonoSound.Models.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {


    public PostService() {
    }

    public List<Post> getAllPosts(){
        return List.of(new Post(1234,"descpost1","post1"));
    }
}
