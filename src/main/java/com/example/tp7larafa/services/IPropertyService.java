package com.example.tp7larafa.services;

import com.example.tp7larafa.entities.Property;

import java.util.List;

public interface IPropertyService {
    void save(Property property);
    List<Property> getAll();
    void delete(Property property);
}
