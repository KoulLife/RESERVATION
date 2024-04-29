package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class ReservationDto {
  String name;
  String phone;
  String email;
  LocalDate reservationDate;

  public ReservationDto(String name, String phone, String email, LocalDate reservationDate) {
    this.name = name;
    this.phone = phone;
    this.email = email;
    this.reservationDate = reservationDate;
  }
}
