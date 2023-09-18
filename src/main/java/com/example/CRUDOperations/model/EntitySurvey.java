package com.example.CRUDOperations.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Data
@NoArgsConstructor
public class EntitySurvey {
    @Id
    private Long id;

    @NotNull
    private String name;
    private String city;

}
