package com.study.exercise.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_person")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String gender;
    private Double weight;
    private String imgUrl;

    public Person(PersonDto dto) {
        this.name = dto.name();
        this.age = dto.age();
        this.gender = dto.gender();
        this.weight = dto.weight();
        this.imgUrl = dto.imgUrl();
    }
}
