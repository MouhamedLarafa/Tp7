package com.example.tp7larafa.controllers;

import com.example.tp7larafa.entities.Owner;
import com.example.tp7larafa.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class OwnerController {
    @Autowired
    OwnerService ownerService;

    @GetMapping("/")
    public String getAllOwners(Model model) {
        List<Owner> ownerList = OwnerService.getAll();
        if(ownerList.size()>0) {
            model.addAttribute("owners", ownerList);
        }
        return "list-owner";
    }
    @GetMapping("/add-owner")
    public String addOwner(Model model) {
        model.addAttribute("owner", new Owner());
        return "add-edit-owner";
    }
    @PostMapping("/save-owner")
    public String saveOwner(Owner owner) {
        ownerService.save(owner);
        return "redirect:/";
    }


    @GetMapping("/owner-delete/{id}")
    public String deleteOwner(@PathVariable("id") Integer id)
    {
        Owner deleteOwner = ownerService.getById(id).get();
        ownerService.delete(deleteOwner);
        return "redirect:/";
    }




}
