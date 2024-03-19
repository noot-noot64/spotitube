package nl.han.oose.dea.dto;

public class LoginDTO {
    private String user;
    private String password;

    // Getters and setters
    public String getUser() {
        return user;
    }

    public void setUser(String username) {
        this.user = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
