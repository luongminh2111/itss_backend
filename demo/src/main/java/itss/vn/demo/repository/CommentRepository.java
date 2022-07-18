package itss.vn.demo.repository;

import itss.vn.demo.entity.Comment;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface CommentRepository extends BaseRepository<Comment, Long> {
}
