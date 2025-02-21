package com.fastcampus.projectboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) {
        return  http
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
                .formLogin()
                .build();
    }

}
