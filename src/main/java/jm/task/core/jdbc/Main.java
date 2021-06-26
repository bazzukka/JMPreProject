package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Kek", "Kekovich", (byte) 30);
        userService.saveUser("Cibi", "Cibivich", (byte) 27);
        userService.saveUser("Рак", "Kurva", (byte) 18);
        userService.saveUser("Crabby", "Crab", (byte) 5);

        userService.getAllUsers();
        userService.dropUsersTable();
    }
}