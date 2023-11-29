package com.study.exercise.model;

public record FindByCategoryRecord(
    String name,
    Integer age,
    Double weight,
    String imgUrl
) {
    public FindByCategoryRecord(Person x) {
        this(x.getName(), x.getAge(), x.getWeight(), x.getImgUrl());
    }


}
