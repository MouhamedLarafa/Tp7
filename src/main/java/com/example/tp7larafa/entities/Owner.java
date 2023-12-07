package com.example.tp7larafa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Owner implements Serializable {
    private Long id ;
    private String name;
    private String contactInformation;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Id getId() {
        return id;
    }
    @ManyToOne
    private RentalContract rentalContract;
}


