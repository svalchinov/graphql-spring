package com.graphql.spring.api;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
  
  public User getUser(String id) {
    User user = new User();
    user.setName( "My user" );
    return user;
  }
  
  public long countUsers() {
    return 1L;
  }
}
