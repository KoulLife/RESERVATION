package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "reservation")
public class Reservation {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  String name;
  String phone;
  String email;
  LocalDate reservationDate;
  Boolean confirm;
  @ManyToOne @JoinColumn(name = "board_id") Board board;
}
