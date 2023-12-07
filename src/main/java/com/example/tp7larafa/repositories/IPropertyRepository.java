package com.example.tp7larafa.repositories;

import com.example.tp7larafa.entities.Property;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPropertyRepository extends JpaRepository<Property, Id> {
}
