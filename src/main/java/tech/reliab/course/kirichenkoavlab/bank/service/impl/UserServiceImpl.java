package tech.reliab.course.kirichenkoavlab.bank.service.impl;

import tech.reliab.course.kirichenkoavlab.bank.entity.User;
import tech.reliab.course.kirichenkoavlab.bank.service.UserService;

public class UserServiceImpl implements UserService {
    private User user = null;

    /**
     *
     * @return возвращает клиента банка
     */
    @Override
    public User getUser() {
        return user;
    }

    /**
     *
     * @param user - новый объект клиента банка
     */
    @Override
    public void setUser(User user) {
        this.user = user;
    }

    /**
     *
     * @param user - объект клиента банка для обновления
     * @return возвращает true, если передан правильный объект клиента банка, иначе false
     */
    @Override
    public Boolean updateUser(User user) {
        if (this.user == user){
            setUser(user);
            return true;
        } else{
            return false;
        }
    }

    /**
     *
     * @param user - объект клиента банка для удаления
     * @return возвращает true, если передан правильный объект клиента банка, иначе false
     */
    @Override
    public Boolean deleteUser(User user) {
        if (this.user == user){
            this.user = null;
            return true;
        } else{
            return false;
        }
    }
}
