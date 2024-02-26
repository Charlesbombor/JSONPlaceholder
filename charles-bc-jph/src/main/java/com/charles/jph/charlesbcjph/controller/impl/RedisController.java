package com.charles.jph.charlesbcjph.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.charles.jph.charlesbcjph.controller.RedisOperation;

import com.charles.jph.charlesbcjph.model.RedisUser;
import com.charles.jph.charlesbcjph.service.RedisService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping(value = "/redis/api/v1")
public class RedisController implements RedisOperation {



  @Autowired
  private RedisService redisService;

  @Override
  public RedisUser createUser(String key, RedisUser user)
      throws JsonProcessingException {
    return redisService.createUser2(key, user);
  }

  @Override
  public RedisUser getUser(String key) throws JsonProcessingException {
    return redisService.getUser2(key);
  }
  
}
