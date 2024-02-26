package com.charles.jph.charlesbcjph.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.charles.jph.charlesbcjph.controller.UserOperation;
import com.charles.jph.charlesbcjph.model.User;
import com.charles.jph.charlesbcjph.service.UserService;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController implements UserOperation {

  @Autowired
  private UserService userService;

  @Override
  public List<User> getUsers() {
    return userService.getUsersFromJPH();
  
  }
  
}
