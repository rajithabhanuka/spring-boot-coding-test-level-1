package com.codejam.demo.repository;

import com.codejam.demo.model.IdolEntity;
import org.springframework.data.repository.CrudRepository;

public interface IdolRepository extends CrudRepository<IdolEntity, Long> {
}
