package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
  String username;
  String password;

  public UserDto(String username, String password) {
    this.username = username;
    this.password = password;
  }
}
