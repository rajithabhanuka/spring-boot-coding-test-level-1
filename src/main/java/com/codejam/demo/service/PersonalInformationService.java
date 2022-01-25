package com.codejam.demo.service;

import com.codejam.demo.dto.PersonalInformationDto;
import com.codejam.demo.dto.ResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PersonalInformationService {

    ResponseEntity<ResponseDto> save(PersonalInformationDto dto);

    ResponseEntity<PersonalInformationDto> get(Integer id);

    ResponseEntity<List<PersonalInformationDto>> get(Integer pageNumber, Integer pageSize);

    ResponseEntity<ResponseDto> update(PersonalInformationDto dto);

    ResponseEntity<ResponseDto> delete(Integer id);

}
