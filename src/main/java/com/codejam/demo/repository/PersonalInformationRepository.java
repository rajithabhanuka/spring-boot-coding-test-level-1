package com.codejam.demo.repository;

import com.codejam.demo.model.PersonalInformationEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface PersonalInformationRepository extends CrudRepository<PersonalInformationEntity, Integer> {

    Page<PersonalInformationEntity> findAll(Pageable pageable);

}
