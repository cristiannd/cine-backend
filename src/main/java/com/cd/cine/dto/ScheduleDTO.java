package com.cd.cine.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ScheduleDTO {

  private Long id;

  private LocalDateTime date;

  private FilmDTO film;

  private CinemaDTO cinema;
}
