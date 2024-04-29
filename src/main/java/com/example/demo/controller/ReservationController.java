package com.example.demo.controller;

import com.example.demo.dto.ReservationDto;
import com.example.demo.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
  @Autowired
  ReservationService reservationService;

  @PostMapping("/create-reservation")
  public void createReservation(Long boardId, ReservationDto reservationDto){
    reservationService.createReservation(boardId, reservationDto);
  }
}
