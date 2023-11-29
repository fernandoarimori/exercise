package com.study.exercise.model;

public record PersonDto(
        String name,
        Integer age,
        String gender,
        Double weight,
        String imgUrl
) {
}
