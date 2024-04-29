package com.example.demo.service;

import com.example.demo.dao.BoardRepository;
import com.example.demo.dto.BoardDto;
import com.example.demo.dto.ReservationDto;
import com.example.demo.model.Board;
import com.example.demo.model.Reservation;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BoardService {
  BoardRepository boardRepository;

  public BoardService(BoardRepository boardRepository) {
    this.boardRepository = boardRepository;
  }

  public void enrollBoard(BoardDto boardDto, User user){
    String title = boardDto.getTitle();
    String content = boardDto.getContent();

    Board board = new Board();
    board.setTitle(title);
    board.setContent(content);
    board.setUser(user);

    boardRepository.save(board);
  }

  public List<ReservationDto> checkReservation(Long boardId){
    Optional<Board> board = boardRepository.findById(boardId);
    List<Reservation> reservations = board.get().getReservations();
    List<ReservationDto> reservationDtos = new ArrayList<>();

    for (Reservation reservation : reservations){
      ReservationDto reservationDto = new ReservationDto(reservation.getName(),
              reservation.getPhone(),
              reservation.getEmail(),
              reservation.getReservationDate()
              );

      reservationDtos.add(reservationDto);
    }

    return reservationDtos;
  }
}
