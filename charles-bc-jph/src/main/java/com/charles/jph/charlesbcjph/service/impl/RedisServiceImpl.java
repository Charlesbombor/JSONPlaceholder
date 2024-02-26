package com.charles.jph.charlesbcjph.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.charles.jph.charlesbcjph.infra.RedisHelper;
import com.charles.jph.charlesbcjph.model.RedisUser;
import com.charles.jph.charlesbcjph.service.RedisService;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class RedisServiceImpl implements RedisService {

  @Autowired
  private RedisHelper redisHelper;

  @Override
  public RedisUser createUser2(String key, RedisUser user)
      throws JsonProcessingException {
    redisHelper.set(key, user);
    return user;
  }

  @Override
  public RedisUser getUser2(String key) throws JsonProcessingException {
    return redisHelper.get(key, RedisUser.class);
  }
  
}
