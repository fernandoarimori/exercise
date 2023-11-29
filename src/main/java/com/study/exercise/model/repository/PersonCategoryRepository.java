package com.study.exercise.model.repository;

import com.study.exercise.model.PersonCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonCategoryRepository extends JpaRepository<PersonCategory, Long> {
}
