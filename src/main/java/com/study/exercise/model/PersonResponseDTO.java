package com.study.exercise.model;

import com.study.exercise.model.projection.PersonProjection;

public record PersonResponseDTO(
        String name,
        Integer age,
        Double weight,
        String imgUrl
) {
    public PersonResponseDTO(PersonProjection x) {
        this(x.getName(), x.getAge(), x.getWeight(), x.getImgUrl());
    }


    public PersonResponseDTO(Person found) {
        this( found.getName(), found.getAge(), found.getWeight(), found.getImgUrl());
    }
}
