package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    private final List<User> userList;

    {
        User user1 = new User(1, "Billy", "Smith");
        User user2 = new User(2, "Jonny", "White");
        User user3 = new User(3, "Garry", "Potter");
        User user4 = new User(4, "Severus", "Snake");
        User user5 = new User(5, "Sally", "Dolgopups");
        userList = List.of(user1, user2, user3, user4, user5);
    }

    @Override
    public List<User> initUser() {
        return userList;
    }

}
