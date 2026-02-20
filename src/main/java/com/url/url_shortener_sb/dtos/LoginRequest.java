package com.url.url_shortener_sb.dtos;


import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    // private String email;
    // private Set<String> role;
    private String password;
}
