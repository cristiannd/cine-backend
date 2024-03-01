package com.cd.cine.controller;

import com.cd.cine.dto.TicketDTO;
import com.cd.cine.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

  @Autowired
  private IUserService userService;

  @PostMapping("/buy-ticket")
  public ResponseEntity<TicketDTO> buyTicket(@RequestParam Long userId, @RequestParam Long scheduleId) throws Exception {
    return new ResponseEntity<>(userService.buyTicket(userId, scheduleId), HttpStatus.CREATED);
  }
}
