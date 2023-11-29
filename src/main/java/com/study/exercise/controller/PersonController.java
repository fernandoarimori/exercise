package com.study.exercise.controller;

import com.study.exercise.model.Person;
import com.study.exercise.model.PersonDto;
import com.study.exercise.model.PersonResponseDTO;
import com.study.exercise.service.PersonService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping
    public List<PersonResponseDTO> findAll() {
        return personService.findAll();
    }
    @GetMapping("/{id}")
    @Transactional
    public PersonResponseDTO findOne(@PathVariable Long id){
        return personService.getOne(id);
    }


    @PostMapping
    public PersonResponseDTO postPerson(@RequestBody PersonDto dto){
        return personService.postPerson(dto);
    }
}
