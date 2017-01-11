package ua.sdo.service;

import ua.sdo.model.users.User;

public interface UserService {

    void createUser(User user);
    User findByName(String login);
    void updateLogin(String login, int id);
    void updatePassword(String password, int id );
}
