package com.url.url_shortener_sb.dtos;


import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UrlMappingDTO {
    private Long id;
    private String originalUrl;
    // private String email;
    // private Set<String> role;
    private String shortUrl;
    private int clickCount;
    private LocalDateTime createdAt;
    private String username;
}
