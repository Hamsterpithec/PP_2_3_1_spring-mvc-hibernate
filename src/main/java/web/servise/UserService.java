package web.servise;

import web.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    User findById(Long id);
    void addUser(User user);
    void deleteUser(long id);
    void updateUser(User user);
}
