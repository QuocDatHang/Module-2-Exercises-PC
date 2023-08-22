package service;

import model.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUser();
    User findUser(long id);
    void addUser(User user);
    void editUser(User user);
    void deleteUser(long id);


}
