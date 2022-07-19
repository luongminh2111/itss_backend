package itss.vn.demo.repository;

import itss.vn.demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User, Long> {
    User getUserByUsernameAndPassword(String username, String password);
    User getUserById(Long id);
}
