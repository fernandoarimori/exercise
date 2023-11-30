package com.study.exercise.model.repository;

import com.study.exercise.model.Position;
import com.study.exercise.model.PositionPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, PositionPK> {
}
