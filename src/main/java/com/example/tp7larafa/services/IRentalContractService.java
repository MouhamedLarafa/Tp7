package com.example.tp7larafa.services;

import com.example.tp7larafa.entities.Owner;
import com.example.tp7larafa.entities.RentalContract;

import java.util.List;

public interface IRentalContractService {
    void save(RentalContract rentalContract);
    List<RentalContract> getAll();
    void delete(RentalContract rentalContract);
}
