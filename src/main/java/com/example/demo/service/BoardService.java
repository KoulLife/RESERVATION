package com.example.demo.service;

import com.example.demo.dao.BoardRepository;
import com.example.demo.dto.BoardDto;
import com.example.demo.model.Board;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
  BoardRepository boardRepository;

  public BoardService(BoardRepository boardRepository) {
    this.boardRepository = boardRepository;
  }

  public void enrollBoard(BoardDto boardDto){
    String title = boardDto.getTitle();
    String content = boardDto.getContent();

    Board board = new Board();
    board.setTitle(title);
    board.setContent(content);

    boardRepository.save(board);
  }
}
