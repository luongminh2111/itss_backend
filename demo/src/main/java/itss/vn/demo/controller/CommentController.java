package itss.vn.demo.controller;

import itss.vn.demo.dto.CommentDTO;
import itss.vn.demo.entity.Comment;
import itss.vn.demo.entity.Review;
import itss.vn.demo.entity.User;
import itss.vn.demo.service.CommentService;
import itss.vn.demo.service.ReviewService;
import itss.vn.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RequestMapping("/api/comment")
public class CommentController {
    private final CommentService commentService;
    private final UserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<CommentDTO>> getAllReview (){
        List<Comment> comments = commentService.getAll();
        List<User> userList = userService.getAll();
        List<CommentDTO> commentDTOList = new ArrayList<CommentDTO>();
        for( int i = 0 ; i < comments.size() ; i++){
            for ( int j = 0 ; j < userList.size() ; j++){
                if(comments.get(i).getUserId() == userList.get(j).getId()){
                    CommentDTO commentDTO = new CommentDTO(userList.get(j).getUsername(), comments.get(i).getId(),
                            comments.get(i).getReviewId(), comments.get(i).getUserId(), comments.get(i).getContent(),
                            comments.get(i).getCreatedDate());
                    commentDTOList.add(commentDTO);
                }
            }
        }
        return ResponseEntity.ok(commentDTOList);
    }
//    @GetMapping("/all1")
//    public ResponseEntity<List<Comment>> getAllReview1 (){
//        var comments = commentService.getAll();
//        return ResponseEntity.ok(comments);
//    }

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
