package nl.han.oose.dea.dto;

public class LoginDTOReponse {
    private String token;
    private String user;

    public LoginDTOReponse(String token, String user) {
        this.token = token;
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public String getUser() {
        return user;
    }
}
