package com.graphql.spring.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class User {
  
  @Getter
  private final String name;
}
