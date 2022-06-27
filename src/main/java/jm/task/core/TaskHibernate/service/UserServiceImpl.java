package jm.task.core.TaskHibernate.service;

import jm.task.core.TaskHibernate.dao.UserDao;
import jm.task.core.TaskHibernate.dao.UserDaoHibernateImpl;
import jm.task.core.TaskHibernate.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDaoHibernateImpl = new UserDaoHibernateImpl();

    public void createUsersTable() {
        userDaoHibernateImpl.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoHibernateImpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoHibernateImpl.saveUser(name, lastName, age);

    }

    public void removeUserById(long id) {
        userDaoHibernateImpl.removeUserById(id);

    }

    public List<User> getAllUsers() {

        return userDaoHibernateImpl.getAllUsers();
    }


    public void cleanUsersTable() {
        userDaoHibernateImpl.cleanUsersTable();
    }
}
