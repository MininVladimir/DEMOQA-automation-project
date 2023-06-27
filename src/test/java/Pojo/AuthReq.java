package Pojo;

public class AuthReq {
    private String userName;
    private String password;

    public AuthReq(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}
