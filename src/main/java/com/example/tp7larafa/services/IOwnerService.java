package com.example.tp7larafa.services;

import com.example.tp7larafa.entities.Owner;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IOwnerService {
    void save(Owner owner);
    List<Owner> getAll();
    void delete(Owner owner);
}
