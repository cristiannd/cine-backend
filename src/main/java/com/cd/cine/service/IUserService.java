package com.cd.cine.service;

import com.cd.cine.dto.TicketDTO;

public interface IUserService {
  TicketDTO buyTicket(Long userId, Long scheduleId) throws Exception;
}
