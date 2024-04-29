package com.example.demo.service;

import com.example.demo.dto.UserDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

  @Test
  void test1(){
    UserService userService = new UserService();
    UserDto userDto = new UserDto("dongik","1234");

    userService.submit(userDto);
  }

}