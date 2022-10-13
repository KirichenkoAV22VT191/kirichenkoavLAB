package tech.reliab.course.kirichenkoavlab.bank.service;

import tech.reliab.course.kirichenkoavlab.bank.entity.Bank;
import tech.reliab.course.kirichenkoavlab.bank.entity.User;

public interface UserService {
    User getUser();
    void setUser(User user);
    Boolean updateUser(User user);
    Boolean deleteUser(User user);
}
