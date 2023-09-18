package com.example.CRUDOperations.repository;

import com.example.CRUDOperations.model.EntitySurvey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorySurvey extends JpaRepository<EntitySurvey, Long> {

}
