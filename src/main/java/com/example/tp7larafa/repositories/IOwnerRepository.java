package com.example.tp7larafa.repositories;

import com.example.tp7larafa.entities.Owner;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;

public interface IOwnerRepository extends JpaRepository<Owner , Id> {
    Map<Object, Object> findById(Integer id);
}
