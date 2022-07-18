package itss.vn.demo.mapper;

import itss.vn.demo.dto.ReviewDTO;
import itss.vn.demo.entity.Review;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReviewMapper extends EntityMapper<ReviewDTO, Review> {
}
