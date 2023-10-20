package entity;

public class Doctor implements User{
    private String username;
    private String password;
    private String specialty;
    private String degree;

    public Doctor(String username, String password, String specialty, String degree) {
        this.username = username;
        this.password = password;
        this.specialty = specialty;
        this.degree = degree;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
