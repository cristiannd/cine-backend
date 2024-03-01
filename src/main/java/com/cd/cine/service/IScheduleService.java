package com.cd.cine.service;

import com.cd.cine.entity.Schedule;

public interface IScheduleService {
  Schedule getSchedule(Long scheduleId) throws Exception;
}
