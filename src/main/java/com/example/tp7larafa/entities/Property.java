package com.example.tp7larafa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Property implements Serializable {
    @Id
    private Long id ;
    private String adress;
    private Double price;


    @ManyToOne
    private RentalContract rentalContract;

    public void setId(Long id) {
        this.id = id;
    }

    public Id getId() {
        return id;
    }
}
