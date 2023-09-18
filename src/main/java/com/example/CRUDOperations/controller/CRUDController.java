package com.example.CRUDOperations.controller;

import com.example.CRUDOperations.model.EntitySurvey;
import com.example.CRUDOperations.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CRUDController {
    @Autowired
    private EntityService entityService;


    @GetMapping("/survey")
    public List<EntitySurvey> getAll() {
        return entityService.getAllEntities();
    }

    @PostMapping("/addSurvey")
    public void addSurvey(@RequestBody EntitySurvey entitySurvey) {
        entityService.addSurvey(entitySurvey);

    }

    @DeleteMapping("/deleteSurvey/{id}")
    public void deleteSurvey(@PathVariable Long id) {
        entityService.deleteSurvey(id);

    }

    @PutMapping("/putSurvey")
    public void putSurvey(){
        System.out.println("Hello");
    }


}
