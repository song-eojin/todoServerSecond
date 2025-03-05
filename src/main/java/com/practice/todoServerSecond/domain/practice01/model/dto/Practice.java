package com.practice.todoServerSecond.domain.practice01.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Practice {
    private Long id;
    private String username;
    private String title;
    private String description;
    private LocalDateTime dueDate;
}
