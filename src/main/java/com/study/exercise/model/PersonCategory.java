package com.study.exercise.model;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "tb_person_category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class PersonCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
