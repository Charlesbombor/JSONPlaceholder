package com.charles.jph.charlesbcjph.controller.impl;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.charles.jph.charlesbcjph.controller.UserOperation;
import com.charles.jph.charlesbcjph.model.User;

@RestController
@RequestMapping(value = "/api/vi")
public class UserController implements UserOperation {

  @Override
  public List<User> getUsers() {

  
  }
  
}
