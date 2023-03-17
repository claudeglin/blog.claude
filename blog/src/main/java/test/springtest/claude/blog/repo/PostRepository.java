package test.springtest.claude.blog.repo;

import org.springframework.data.repository.CrudRepository;
import test.springtest.claude.blog.models.Post;

public interface PostRepository extends CrudRepository <Post,Long>{
}
