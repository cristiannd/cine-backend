package com.cd.cine.service.impl;

import com.cd.cine.dto.TicketDTO;
import com.cd.cine.entity.Ticket;
import com.cd.cine.repository.TicketRepository;
import com.cd.cine.service.ITicketService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TicketService implements ITicketService {

  @Autowired
  private TicketRepository ticketRepository;

  @Autowired
  private ModelMapper modelMapper;

  @Override
  public TicketDTO save(Ticket ticket) {
    Ticket savedTicket = ticketRepository.save(ticket);

    return modelMapper.map(savedTicket, TicketDTO.class);
  }
}
