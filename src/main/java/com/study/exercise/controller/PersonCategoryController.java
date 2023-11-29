package com.study.exercise.controller;

import com.study.exercise.model.FindByCategoryRecord;
import com.study.exercise.model.PersonCategoryDTO;
import com.study.exercise.model.PersonResponseDTO;
import com.study.exercise.service.PersonCategoryService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class PersonCategoryController {
    @Autowired
    private PersonCategoryService service;
    @GetMapping
    public List<PersonCategoryDTO> findAllCategoryCntrllr(){
        return service.findAll();
    }

    @GetMapping("/{id}/persons")
    @Transactional
    public List<PersonResponseDTO> findPersonInACategory(@PathVariable Long id){
        return service.findByCategoryRecordList(id);
    }
}
