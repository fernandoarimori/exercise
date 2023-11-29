package com.study.exercise.model.repository;

import com.study.exercise.model.FindByCategoryRecord;
import com.study.exercise.model.Person;
import com.study.exercise.model.projection.PersonProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    @Query(nativeQuery = true,value = """
            SELECT tb_person.name, tb_person.age, tb_person.weight, tb_person.img_url AS imgUrl
            FROM    tb_person
            INNER JOIN tb_position ON tb_person.id = tb_position.person_id
            WHERE tb_position.category_id = :categoryId
            ORDER BY tb_position.place
            """)
    List<PersonProjection> searchByCategory (Long categoryId);
}
