package com.codejam.demo.repository;

import com.codejam.demo.model.ScheduleEntity;
import org.springframework.data.repository.CrudRepository;

public interface ScheduleRepository extends CrudRepository<ScheduleEntity, Long> {
}
