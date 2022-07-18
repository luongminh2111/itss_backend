package itss.vn.demo.mapper;

import itss.vn.demo.dto.CommentDTO;
import itss.vn.demo.entity.Comment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommentMapper extends EntityMapper<CommentDTO, Comment> {
}
