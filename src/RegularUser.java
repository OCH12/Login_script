public class RegularUser extends User {
    public RegularUser(String username, String password)
    {
        super(username, password);
    }
    @Override public void login() {
        // Implementation of regular user login
        System.out.println("User " + username + " logged in.");
    }
    @Override public void logout() {
        // Implementation of regular user logout
        System.out.println("User " + username + " logged out.");
    }
}
