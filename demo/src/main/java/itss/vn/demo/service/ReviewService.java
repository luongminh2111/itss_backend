package itss.vn.demo.service;

import itss.vn.demo.entity.Review;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ReviewService extends BaseService<Review, Long>{
    List<Review> findAllOrAndOrderById();
}
