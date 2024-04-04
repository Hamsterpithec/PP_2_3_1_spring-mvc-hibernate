package web.dao;

import web.model.User;
import java.util.List;
import java.util.Optional;

public interface UserDao {
    List<User> getAllUsers();
    Optional<User> findById(Long id);
    void addUser(User user);
    void deleteUser(long id);
    void updateUser(User user);

}
