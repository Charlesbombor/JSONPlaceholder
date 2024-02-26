package com.charles.jph.charlesbcjph.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.charles.jph.charlesbcjph.infra.BcUtil;
import com.charles.jph.charlesbcjph.infra.Scheme;
import com.charles.jph.charlesbcjph.model.User;
import com.charles.jph.charlesbcjph.service.UserService;


@Service
public class UserJPH implements UserService{

  @Value(value = "${api.jph.domain}")
  private String domain;

  @Value(value = "${api.jph.endpoints.user}")
  private String userEndpoint;

  @Autowired
  private RestTemplate restTemplate;


  @Override
  public List<User> getUsersFromJPH() {
    String userUrl = BcUtil.url(Scheme.HTTPS, domain, userEndpoint);
    User[] users = restTemplate.getForObject(userUrl, User[].class);

    return Arrays.stream(users) //
      .collect(Collectors.toList());
  }
  
}
