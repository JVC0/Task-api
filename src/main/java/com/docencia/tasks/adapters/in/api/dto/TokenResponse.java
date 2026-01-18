package com.docencia.tasks.adapters.in.api.dto;

public class TokenResponse {
    private String token;

    public TokenResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

