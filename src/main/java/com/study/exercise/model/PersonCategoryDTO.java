package com.study.exercise.model;

public record PersonCategoryDTO(
        String name
) {
    public PersonCategoryDTO(PersonCategory p){
        this(p.getName());
    }
}
