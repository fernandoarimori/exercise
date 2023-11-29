package com.study.exercise.service;

import com.study.exercise.model.FindByCategoryRecord;
import com.study.exercise.model.Person;
import com.study.exercise.model.PersonDto;
import com.study.exercise.model.PersonResponseDTO;
import com.study.exercise.model.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.PanelUI;
import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<PersonResponseDTO> findAll(){
        List<PersonResponseDTO> personsResponse = personRepository.findAll().stream().map(x-> new PersonResponseDTO(x)).toList();
        return personsResponse;
    }

    public PersonResponseDTO getOne(Long id){
        var found = personRepository.getReferenceById(id);
        return new PersonResponseDTO(found);
    }
    public PersonResponseDTO postPerson(PersonDto dto){
        Person toSafe = new Person(dto);
        personRepository.save(toSafe);
        return new PersonResponseDTO(toSafe);
    }



}
