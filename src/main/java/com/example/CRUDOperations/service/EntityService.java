package com.example.CRUDOperations.service;

import com.example.CRUDOperations.exceptions.ResourceNotFoundException;
import com.example.CRUDOperations.model.EntitySurvey;
import com.example.CRUDOperations.repository.RepositorySurvey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService {
    @Autowired
    private RepositorySurvey repositorySurvey;

    public List<EntitySurvey> getAllEntities() {
        return repositorySurvey.findAll();
    }

    public void addSurvey(EntitySurvey entitySurvey) {
        repositorySurvey.save(entitySurvey);
    }

    public void deleteSurvey(Long id) {

        repositorySurvey.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Record not found with id: "+ id)
        );
        repositorySurvey.deleteById(id);
    }
}
