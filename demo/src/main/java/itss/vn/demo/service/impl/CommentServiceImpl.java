package itss.vn.demo.service.impl;

import itss.vn.demo.dto.CommentDTO;
import itss.vn.demo.entity.Comment;
import itss.vn.demo.mapper.CommentMapper;
import itss.vn.demo.repository.CommentRepository;
import itss.vn.demo.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl extends BaseServiceImpl<Comment, Long> implements CommentService {
    private final CommentRepository commentRepository;
    private final CommentMapper commentMapper;
    public CommentServiceImpl(CommentRepository commentRepository, CommentMapper commentMapper) {
        super(commentRepository);
        this.commentRepository = commentRepository;
        this.commentMapper =commentMapper;
    }

    @Override
    public Comment save(Comment entity) {
        return super.save(entity);
    }

    @Override
    public List<CommentDTO> getAllUserComment() {
        List<CommentDTO> commentDtoList = commentRepository.getAllUserComment();
        return commentDtoList;
    }

    @Override
    public List<Comment> getAll() {
        return super.getAll();
    }
}
