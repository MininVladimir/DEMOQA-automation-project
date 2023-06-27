package Pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthRes {
    private String token;

    public AuthRes(String token) {
        this.token = token;
    }

    public AuthRes() {
    }

    public String getToken() {
        return token;
    }

}
