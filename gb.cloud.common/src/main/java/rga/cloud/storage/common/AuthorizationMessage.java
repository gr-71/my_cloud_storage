package rga.cloud.storage.common;


public class AuthorizationMessage extends AbstractMessage {

    private String login;
    private String password;

    public AuthorizationMessage(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
