package com.example.tp7larafa.services;

import com.example.tp7larafa.entities.Owner;
import com.example.tp7larafa.repositories.IOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class OwnerService implements IOwnerService {

@Autowired
    IOwnerRepository ownerRepository;
    @Override
    public void save(Owner owner) {
        if (owner.getId() == null) {
            ownerRepository.save(owner);
        } else {
            Owner ownerUpdate =
                    ownerRepository.findById(owner.getId()).get();
            ownerUpdate.setName(owner.getName());
            ownerUpdate.setContactInformation(owner.getContactInformation());

            ownerRepository.save(ownerUpdate);
        }

    }
    @Override
    public static List<Owner> getAll(){
        return ownerRepository.findAll();
    }

    @Override
    public void delete(Owner owner) {
        ownerRepository.delete(owner);
    }



}

