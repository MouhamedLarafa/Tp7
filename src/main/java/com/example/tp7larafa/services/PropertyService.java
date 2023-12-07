package com.example.tp7larafa.services;

import com.example.tp7larafa.entities.Owner;
import com.example.tp7larafa.entities.Property;
import com.example.tp7larafa.repositories.IOwnerRepository;
import com.example.tp7larafa.repositories.IPropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class PropertyService implements IPropertyService{
    @Autowired
    IPropertyRepository propertyRepository;
    @Override
    public void save(Property property) {
        if (property.getId() == null) {
            propertyRepository.save(property);
        } else {
            Property propertyUpdate;
            propertyUpdate = propertyRepository.findById(property.getId()).get();
            propertyUpdate.setAdress(property.getAdress());
            propertyUpdate.setPrice(property.getPrice());

            propertyRepository.save(propertyUpdate);
        }

    }
    @Override
    public  List<Property> getAll(){
        return propertyRepository.findAll();
    }


    @Override
    public void delete(Property property) {
        propertyRepository.delete(property);
    }

}
