package com.charles.jph.charlesbcjph.service;

import com.charles.jph.charlesbcjph.model.RedisUser;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface RedisService {

  RedisUser createUser2(String key, RedisUser user) throws JsonProcessingException;

  RedisUser getUser2(String key) throws JsonProcessingException;
  
}
