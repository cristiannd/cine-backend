package com.cd.cine.service.impl;

import com.cd.cine.dto.TicketDTO;
import com.cd.cine.entity.Schedule;
import com.cd.cine.entity.Ticket;
import com.cd.cine.entity.User;
import com.cd.cine.repository.UserRepository;
import com.cd.cine.service.IScheduleService;
import com.cd.cine.service.ITicketService;
import com.cd.cine.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private IScheduleService scheduleService;

  @Autowired
  private ITicketService ticketService;

  private User getUser(Long userId) throws Exception {
    return userRepository
            .findById(userId)
            .orElseThrow(() -> new Exception("The user is not exist."));
  }

  @Override
  public TicketDTO buyTicket(Long userId, Long scheduleId) throws Exception {
    User user = getUser(userId);
    Schedule schedule = scheduleService.getSchedule(scheduleId);

    Ticket ticket = Ticket.builder()
            .buyDate(LocalDateTime.now())
            .user(user)
            .schedule(schedule)
            .build();

    return ticketService.save(ticket);
  }
}
