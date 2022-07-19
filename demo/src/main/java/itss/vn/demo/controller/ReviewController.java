package itss.vn.demo.controller;

import itss.vn.demo.dto.ReviewDTO;
import itss.vn.demo.entity.Review;
import itss.vn.demo.service.ReviewService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RequestMapping("/api/review")
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping("/all")
    public ResponseEntity<List<Review>> getAllReview (){
        var review = reviewService.findAllOrAndOrderById();
        return ResponseEntity.ok(review);
    }

    @PostMapping
    public ResponseEntity<Review> save (@RequestBody Review review){
        try {
            reviewService.save(review);
            return ResponseEntity.ok(review);
        }catch (Exception e){
            log.error(" | {} |{} ", review.toString(), e);
            return new ResponseEntity<Review>(review, HttpStatus.BAD_REQUEST);
        }
    }
}
