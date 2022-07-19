package itss.vn.demo.controller;

import itss.vn.demo.entity.Review;
import itss.vn.demo.entity.User;
import itss.vn.demo.service.ReviewService;
import itss.vn.demo.service.UserService;
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
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUser (){
        var users = userService.getAll();
        return ResponseEntity.ok(users);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById (@PathVariable("id") Long id){
        var user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }
    @PostMapping
    public ResponseEntity<User> save (@RequestBody User user){
        try {
            userService.save(user);
            return ResponseEntity.ok(user);
        }catch (Exception e){
            log.error(" | {} |{} ", user.toString(), e);
            return new ResponseEntity<User>(user, HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/name={username}/pass={password}")
    public ResponseEntity<User> getUserByUsernameAndPassword(@PathVariable("username") String username, @PathVariable("password") String password){
        try {
            User user =userService.getUserByUsernameAndPassword(username, password);
            if(user != null){
                return ResponseEntity.ok(user);
            }
            else {
                return ResponseEntity.ok(null);
            }
        }catch (Exception e){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }
}
