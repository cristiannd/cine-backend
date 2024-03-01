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
public class TicketDTO {

  private Long id;

  private LocalDateTime buyDate;

  private ScheduleDTO schedule;
}
