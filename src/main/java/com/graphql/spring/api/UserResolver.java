package com.graphql.spring.api;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class UserResolver implements GraphQLResolver<User> {
  
  public User getUser() {
    User user = new User();
    user.setName("My user");
    return user;
  }
}
