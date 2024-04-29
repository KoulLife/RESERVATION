package com.example.demo.controller;

import com.example.demo.dto.BoardDto;
import com.example.demo.dto.ReservationDto;
import com.example.demo.model.Reservation;
import com.example.demo.model.RoleType;
import com.example.demo.model.User;
import com.example.demo.service.BoardService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController {
  @Autowired
  BoardService boardService;
  @Autowired
  UserService userService;

  @PostMapping("/write-board")
  public void writeBoard(BoardDto boardDto, String username){
    User user = userService.findByUsername(username);
    if (user.getRoleType() == RoleType.USER){
      System.out.println("ERROR");
    }
    else {
      boardService.enrollBoard(boardDto, user);
    }
  }

  @GetMapping("/check-reservation")
  public List<ReservationDto> checkReservation(Long boardId){
    return boardService.checkReservation(boardId);
  }
}
