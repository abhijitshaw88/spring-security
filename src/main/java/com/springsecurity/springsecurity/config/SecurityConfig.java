package com.springsecurity.springsecurity.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@EnableWebSecurity
public class SecurityConfig {

  private HttpSecurity http;

  //This will has highest priority in security
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    this.http = http;
    http.authorizeHttpRequests((requests) -> requests.anyRequest()
          .authenticated()).httpBasic(withDefaults());
    return http.build();
  }
}
