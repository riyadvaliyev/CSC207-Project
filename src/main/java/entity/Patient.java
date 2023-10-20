package entity;

public class Patient implements User {
    private String username;
    private String password;
    private char sex;
    private String gender;
    private float height;
    private float weight;
    private String bloodType;

    public Patient(String username, String password, char sex, String gender, float height, float weight,
                   String bloodType) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.bloodType = bloodType;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
