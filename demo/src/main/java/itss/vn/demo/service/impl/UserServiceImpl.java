package itss.vn.demo.service.impl;

import itss.vn.demo.entity.Review;
import itss.vn.demo.entity.User;
import itss.vn.demo.mapper.ReviewMapper;
import itss.vn.demo.mapper.UserMapper;
import itss.vn.demo.repository.ReviewRepository;
import itss.vn.demo.repository.UserRepository;
import itss.vn.demo.service.ReviewService;
import itss.vn.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        super(userRepository);
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User save(User entity) {
        return super.save(entity);
    }

    @Override
    public List<User> getAll() {
        return super.getAll();
    }
}
