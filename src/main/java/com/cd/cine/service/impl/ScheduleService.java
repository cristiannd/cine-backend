package com.cd.cine.service.impl;

import com.cd.cine.entity.Schedule;
import com.cd.cine.repository.ScheduleRepository;
import com.cd.cine.service.IScheduleService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ScheduleService implements IScheduleService {

  @Autowired
  private ScheduleRepository scheduleRepository;

  @Autowired
  private ModelMapper modelMapper;

  @Override
  public Schedule getSchedule(Long scheduleId) throws Exception {
    return scheduleRepository
            .findById(scheduleId)
            .orElseThrow(() -> new Exception("The schedule is not exist."));
  }
}
