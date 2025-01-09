// Admin class inherits from User
public class admin extends User {
    public admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void login() {
        // Implementation of admin login
        System.out.println("Admin " + username + " logged in.");
    }

    @Override
    public void logout() {
        // Implementation of admin logout
        System.out.println("Admin " + username + " logged out.");
    }
}

