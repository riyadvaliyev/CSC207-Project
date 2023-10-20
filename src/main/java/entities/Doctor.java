package entities;

public class Doctor implements User{
    private String username;
    private String password;

    public Doctor(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
