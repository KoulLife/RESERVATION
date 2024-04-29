package com.example.demo.controller;

import com.example.demo.dto.BoardDto;
import com.example.demo.dto.UserDto;
import com.example.demo.model.RoleType;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  @Autowired
  UserService userService;

  @PostMapping("/register")
  public void register(UserDto userDto){
    userService.submit(userDto);
  }

  @PostMapping("/access-expert")
  public void accessExpert(Long id){
    userService.changeToExpert(id);
  }

}
