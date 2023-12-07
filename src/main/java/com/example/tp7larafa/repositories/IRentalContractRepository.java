package com.example.tp7larafa.repositories;

import com.example.tp7larafa.entities.RentalContract;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentalContractRepository extends JpaRepository<RentalContract, Id> {
}
