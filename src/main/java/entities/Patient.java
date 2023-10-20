package entities;

public class Patient implements User {
    private String username;
    private String password;

    public Patient(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getName() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
