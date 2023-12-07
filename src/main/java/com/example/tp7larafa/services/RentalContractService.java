package com.example.tp7larafa.services;

import com.example.tp7larafa.entities.Owner;
import com.example.tp7larafa.entities.Property;
import com.example.tp7larafa.entities.RentalContract;
import com.example.tp7larafa.repositories.IRentalContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class RentalContractService implements IRentalContractService {
    @Autowired
    IRentalContractRepository rentalContractRepository;
    @Override
    public void save(RentalContract rentalContract) {
        if (rentalContract.getId() == null) {
            rentalContractRepository.save(rentalContract);
        } else {
            RentalContract rentalUpdate =
                    rentalContractRepository.findById(rentalContract.getId()).get();
            rentalUpdate.setTenant(rentalContract.getTenant());
            rentalUpdate.setMonthlyRent(rentalContract.getMonthlyRent());


            rentalContractRepository.save(rentalUpdate);
        }

    }
    @Override
    public List<RentalContract> getAll(){
        return rentalContractRepository.findAll();
    }

    @Override
    public void delete(RentalContract rentalContract) {
        rentalContractRepository.delete(rentalContract);
    }

}
