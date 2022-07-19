package itss.vn.demo.service.impl;

import itss.vn.demo.dto.ReviewDTO;
import itss.vn.demo.entity.Review;
import itss.vn.demo.mapper.ReviewMapper;
import itss.vn.demo.repository.ReviewRepository;
import itss.vn.demo.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl extends BaseServiceImpl<Review, Long> implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final  ReviewMapper reviewMapper;

    public ReviewServiceImpl(ReviewRepository reviewRepository, ReviewMapper reviewMapper) {
        super(reviewRepository);
        this.reviewRepository = reviewRepository;
        this.reviewMapper = reviewMapper;
    }

    @Override
    public List<Review> findAllOrAndOrderById() {
        List<Review> reviewList= reviewRepository.findAllOrAndOrderById();
        return reviewList;
    }

    @Override
    public Review save(Review entity) {
        return super.save(entity);
    }

    @Override
    public List<Review> getAll() {
        return super.getAll();
    }
}
