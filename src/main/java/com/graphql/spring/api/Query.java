package com.graphql.spring.api;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
  
  public User getUser() {
    return new User("Hello world");
  }
  
  public int countUsers() {
    return 1;
  }
}
