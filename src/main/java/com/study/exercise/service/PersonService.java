package com.study.exercise.service;

import com.study.exercise.model.*;
import com.study.exercise.model.repository.PersonCategoryRepository;
import com.study.exercise.model.repository.PersonRepository;
import com.study.exercise.model.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PersonCategoryRepository personCategoryRepository;

    @Autowired
    private PositionRepository positionRepository;

    public List<PersonResponseDTO> findAll() {
        List<PersonResponseDTO> personsResponse = personRepository.findAll().stream().map(x -> new PersonResponseDTO(x)).toList();
        return personsResponse;
    }

    public PersonResponseDTO getOne(Long id) {
        var found = personRepository.getReferenceById(id);
        return new PersonResponseDTO(found);
    }

    public PersonResponseDTO postPerson(PersonDto dto) {
        Person toSafe = new Person(dto);
        var cat = personWeightSet(dto.weight());
        var newPerson = personRepository.save(toSafe);
        Integer allPerson = Math.toIntExact(personRepository.count());
        var place = positionRepository.countFromCat(cat.getId());
        Position newPosition = new Position(newPerson, cat, place);
        positionRepository.save(newPosition);
        return new PersonResponseDTO(toSafe);
    }

    private PersonCategory personWeightSet(Double weight) {
        if (weight <= 80) {
            return personCategoryRepository.getReferenceById(1L);
        }
        if (weight <= 110) {
            return personCategoryRepository.getReferenceById(2L);
        }
        if (weight > 111) {
            return personCategoryRepository.getReferenceById(3L);
        }
        throw new NullPointerException("Can't be null");
    }


}
