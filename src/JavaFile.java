 //import java.lang.classfile.attribute.SourceFileAttribute;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaFile {
    private static Map<String, User> users = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Registration
        System.out.println("Enter username to register:");
        String username = scanner.nextLine();

        System.out.println("Enter password to register:");
        String password = new String(System.console().readPassword());

        if (username.equals("admin")) {
            users.put(username, new admin(username, password));
        } else {
            users.put(username, new RegularUser(username, password));
        }

        System.out.println("Registration successful!");

        // Login
        System.out.println("Enter username to login:");
        username = scanner.nextLine();

        System.out.println("Enter password to login:");
        password = new String(System.console().readPassword());

        User user = users.get(username);

        if (user != null && user.password.equals(password)) {
            user.login();
            user.logout();
        } else {
            System.out.println("Invalid username or password.");
        }

        // Original project code
        int a = 12;
        int b = 13;
        int result = a * b;
        System.out.println("result = " + result);

        result++;
    }
}
