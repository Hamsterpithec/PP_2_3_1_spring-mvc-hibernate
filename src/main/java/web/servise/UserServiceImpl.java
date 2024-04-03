package web.servise;

import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> usersCount(int number) {
        List<User> userList = userDao.initUser();
        return userList.stream().limit(number).collect(Collectors.toList());
    }
}
