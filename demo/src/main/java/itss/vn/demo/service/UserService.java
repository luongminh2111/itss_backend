package itss.vn.demo.service;

import itss.vn.demo.entity.Comment;
import itss.vn.demo.entity.User;

public interface UserService  extends BaseService<User, Long> {
    User getUserByUsernameAndPassword(String username, String password);
    User getUserById(Long id);
}
