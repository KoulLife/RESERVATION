package com.example.demo.dao;

import com.example.demo.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {
  Optional<Board> findById(Long id);
}
