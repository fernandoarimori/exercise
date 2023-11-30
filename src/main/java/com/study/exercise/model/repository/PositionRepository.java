package com.study.exercise.model.repository;

import com.study.exercise.model.PersonCategory;
import com.study.exercise.model.Position;
import com.study.exercise.model.PositionPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PositionRepository extends JpaRepository<Position, PositionPK> {
    @Query(nativeQuery = true,value = """
            SELECT COUNT(1) FROM TB_POSITION 
            WHERE CATEGORY_ID = :cat
            """)
    Integer countFromCat(Long cat);
}
