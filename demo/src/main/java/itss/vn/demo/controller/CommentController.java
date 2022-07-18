package itss.vn.demo.controller;

import itss.vn.demo.entity.Comment;
import itss.vn.demo.entity.Review;
import itss.vn.demo.service.CommentService;
import itss.vn.demo.service.ReviewService;
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
@RequestMapping("/api/comment")
public class CommentController {
    private final CommentService commentService;

    @GetMapping("/all")
    public ResponseEntity<List<Comment>> getAllReview (){
        var comments = commentService.getAll();
        return ResponseEntity.ok(comments);
    }

    @PostMapping
    public ResponseEntity<Comment> save (@RequestBody Comment comment){
        try {
            commentService.save(comment);
            return ResponseEntity.ok(comment);
        }catch (Exception e){
            log.error(" | {} |{} ", comment.toString(), e);
            return new ResponseEntity<Comment>(comment, HttpStatus.BAD_REQUEST);
        }
    }
}
