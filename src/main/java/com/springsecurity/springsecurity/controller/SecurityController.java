package com.springsecurity.springsecurity.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SecurityController {

  @GetMapping("/hello-world")
  public ResponseEntity<String> helloWorld(){
    return ResponseEntity.ok("Hello World");
  }
}
