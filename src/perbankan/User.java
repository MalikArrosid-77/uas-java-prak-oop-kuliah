package perbankan;

public class User {
    protected String username, password;
    public User() {}
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public boolean login() { return username.equals(this.getUsername()) && password.equals(this.getPassword()); }
}