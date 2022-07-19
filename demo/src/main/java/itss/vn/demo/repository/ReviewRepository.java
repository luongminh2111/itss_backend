package itss.vn.demo.repository;

import itss.vn.demo.dto.ReviewDTO;
import itss.vn.demo.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends BaseRepository<Review, Long> {

    @Query(value = "SELECT * FROM itss.reviews order by id desc", nativeQuery = true)
    List<Review> findAllOrAndOrderById();
}
