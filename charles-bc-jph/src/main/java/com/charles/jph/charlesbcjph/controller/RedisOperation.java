package com.charles.jph.charlesbcjph.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.charles.jph.charlesbcjph.model.RedisUser;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface RedisOperation {
  
  @PostMapping(value = "/redisuser")
  RedisUser createUser(@RequestParam String key, @RequestBody RedisUser user)
      throws JsonProcessingException;

  @GetMapping(value = "/redisuser")
  RedisUser getUser(@RequestParam String key) throws JsonProcessingException;

}
