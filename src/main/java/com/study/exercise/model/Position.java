package com.study.exercise.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_position")
@NoArgsConstructor
@Getter
@Setter
//@EqualsAndHashCode(of = "pk")
public class Position {
    @EmbeddedId
    private PositionPK pk = new PositionPK();
    private Integer place;

    public Position(Person person, PersonCategory category, Integer place) {
        pk.setPerson(person);
        pk.setCategory(category);
        this.place = place;
    }
}
