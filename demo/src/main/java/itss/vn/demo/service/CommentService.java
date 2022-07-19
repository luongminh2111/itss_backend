package itss.vn.demo.service;

import itss.vn.demo.dto.CommentDTO;
import itss.vn.demo.entity.Comment;

import java.util.List;

public interface CommentService extends BaseService<Comment, Long> {
    List<CommentDTO> getAllUserComment();
}
