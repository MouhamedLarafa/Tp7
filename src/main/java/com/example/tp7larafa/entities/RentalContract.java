package com.example.tp7larafa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class RentalContract implements Serializable {
    private Long id ;
    private String tenant;
    private Double monthlyRent;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Id getId() {
        return id;


}
    @OneToMany
    private List<Owner> owners;
    @OneToMany
    private List<Property> properties;
}
