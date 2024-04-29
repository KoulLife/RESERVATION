package com.example.demo.service;

import com.example.demo.dao.UserRepository;
import com.example.demo.dto.UserDto;
import com.example.demo.model.RoleType;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {
  @Autowired
  UserRepository userRepository;

  public void submit(UserDto userDto){
    String username = userDto.getUsername();
    String password = userDto.getPassword();
    RoleType role = RoleType.USER;

    User user = new User();
    user.setUsername(username);
    user.setPassword(password);
    user.setRoleType(role);

    userRepository.save(user);
  }

  public User findByUsername(String username){
    return userRepository.findByUsername(username);
  }

  @Transactional
  public void changeToExpert(Long id){
    Optional<User> user = userRepository.findById(id);
    user.get().setRoleType(RoleType.EXPERT);
  }
}
