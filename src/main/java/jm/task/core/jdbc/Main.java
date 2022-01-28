package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();
        userDao.saveUser("Ivan2", "Ivanov2", (byte) 20);
        userDao.saveUser("Petr", "Petrov", (byte) 21);
        userDao.saveUser("Nikolay", "Nikolaev", (byte) 22);
        userDao.saveUser("Roman", "Romanov", (byte) 23);
        List<User> list = userDao.getAllUsers();
        userDao.removeUserById(2);
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}

