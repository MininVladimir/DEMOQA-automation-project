package Pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RegistrationRes {
    private String userID;

    public RegistrationRes(String userID) {
        this.userID = userID;
    }

    public RegistrationRes() {
    }

    public String getUserID() {
        return userID;
    }

}
