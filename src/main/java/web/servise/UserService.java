package web.servise;

import web.model.User;
import java.util.List;

public interface UserService {
    List<User> usersCount(int number);
}
