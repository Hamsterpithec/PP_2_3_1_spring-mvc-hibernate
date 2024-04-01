package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    private final List<User> userList;

    {
        User user1 = new User("BMV", "Blue", 415);
        User user2 = new User("Mersedes", "White", 180);
        User user3 = new User("Lada", "Green", 2407);
        User user4 = new User("Mazda", "Black", 5);
        User user5 = new User("Mitsubisi", "Silver", 9);
        userList = List.of(user1, user2, user3, user4, user5);
    }

    @Override
    public List<User> initUser() {
        return userList;
    }

}
