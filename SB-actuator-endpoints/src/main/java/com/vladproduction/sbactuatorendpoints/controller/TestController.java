package com.vladproduction.sbactuatorendpoints.controller;

import com.vladproduction.sbactuatorendpoints.configs.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
 
 @Autowired
 private TestService testService;
 
 @GetMapping("/messages")
 public String getMessage() {
  return "Hello";
 }
}