package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BoardDto {
  String title;
  String content;

  public BoardDto(String title, String content) {
    this.title = title;
    this.content = content;
  }
}
