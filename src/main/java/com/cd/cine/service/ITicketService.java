package com.cd.cine.service;

import com.cd.cine.dto.TicketDTO;
import com.cd.cine.entity.Ticket;

public interface ITicketService {
  TicketDTO save(Ticket ticket);
}
