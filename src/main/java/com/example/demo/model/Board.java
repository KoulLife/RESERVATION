package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "board")
public class Board {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  String title;
  String content;
  @OneToOne @JoinColumn(name = "user_id") User user;
  @ToString.Exclude @OneToMany(mappedBy="board", fetch = FetchType.LAZY, cascade = CascadeType.ALL) List<Reservation> reservations;
}
