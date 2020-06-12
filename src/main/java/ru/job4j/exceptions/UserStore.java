package ru.job4j.exceptions;

import java.util.Scanner;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int index = -1;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUserName().equals(login)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new UserNotFoundException("User not found");
        }
        return users[index];
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rst = false;
        if (user.isValid() && user.getUserName().length() > 3) {
            rst = true;
        } else {
            throw new UserInvalidException("Invalid username or username is less than three symbols");
        }
        return rst;
    }

    public static void main(String[] args) {
        User[] users = {
              new User("Ilia Chernov", true),
                new User("Ivanov Ivan", true),
                new User("Petrov Pavel", false),
                new User("Pe", true)
        };
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter login");
            User user = findUser(users, scanner.nextLine());
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException uie) {
            uie.printStackTrace();
        } catch (UserNotFoundException unfe) {
            unfe.printStackTrace();
        }
    }
}