package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();

        userDaoJDBC.createUsersTable();

        userDaoJDBC.saveUser("User name one", "User LatName one", (byte) 10);
        userDaoJDBC.saveUser("User name two", "User LatName two", (byte) 15);
        userDaoJDBC.saveUser("User name three", "User LatName three", (byte) 20);
        userDaoJDBC.saveUser("User name four", "User LatName four", (byte) 25);

        userDaoJDBC.getAllUsers().forEach(System.out::println);
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();

    }
}
