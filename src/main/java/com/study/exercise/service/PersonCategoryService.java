package com.study.exercise.service;

import com.study.exercise.model.PersonCategoryDTO;
import com.study.exercise.model.PersonResponseDTO;
import com.study.exercise.model.repository.PersonCategoryRepository;
import com.study.exercise.model.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonCategoryService {
    @Autowired
    private PersonCategoryRepository repository;
    @Autowired
    private PersonRepository personRepository;

    public List<PersonCategoryDTO> findAll() {
        var all = repository.findAll();
        return all.stream().map(PersonCategoryDTO::new).toList();
    }

    public List<PersonResponseDTO> findByCategoryRecordList(Long id) {
        var all = personRepository.searchByCategory(id);
        return all.stream().map(x -> new PersonResponseDTO(x)).toList();
    }
}
