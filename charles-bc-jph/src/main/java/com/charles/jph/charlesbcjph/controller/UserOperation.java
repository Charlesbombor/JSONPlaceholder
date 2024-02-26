package com.charles.jph.charlesbcjph.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.charles.jph.charlesbcjph.model.User;

public interface UserOperation {
  
  @GetMapping(value = "/users")
  List<User> getUsers();
}
