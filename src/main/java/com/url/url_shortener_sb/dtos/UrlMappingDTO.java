package com.url.url_shortener_sb.dtos;


import java.time.LocalDateTime;

// import org.jspecify.annotations.Nullable;

import lombok.Data;

@Data
public class UrlMappingDTO {
    private Long id;
    private String originalUrl;
    // private String email;
    // private Set<String> role;
    private String shortUrl;
    private int clickCount;
    private LocalDateTime createdDate;
    private String username;
    private String password;
}
