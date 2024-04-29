package com.example.demo.service;

import com.example.demo.dao.BoardRepository;
import com.example.demo.dao.ReservationRepository;
import com.example.demo.dto.ReservationDto;
import com.example.demo.model.Board;
import com.example.demo.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservationService {
  @Autowired
  private ReservationRepository reservationRepository;

  @Autowired
  private BoardRepository boardRepository;

  public void createReservation(Long boardId, ReservationDto reservationDto){
    Optional<Board> board = boardRepository.findById(boardId);

    Reservation reservation = new Reservation();
    reservation.setName(reservationDto.getName());
    reservation.setPhone(reservationDto.getPhone());
    reservation.setEmail(reservationDto.getEmail());
    reservation.setConfirm(Boolean.FALSE);
    reservation.setReservationDate(reservationDto.getReservationDate());
    reservation.setBoard(board.get());

    reservationRepository.save(reservation);
  }
}
