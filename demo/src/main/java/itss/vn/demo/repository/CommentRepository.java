package itss.vn.demo.repository;

import itss.vn.demo.dto.CommentDTO;
import itss.vn.demo.entity.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface CommentRepository extends BaseRepository<Comment, Long> {
    @Query(value = "SELECT users.username, comment.* from users, comment where comment.user_id = users.id", nativeQuery = true)
    List<CommentDTO> getAllUserComment();
}
