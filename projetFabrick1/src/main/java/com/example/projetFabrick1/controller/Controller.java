package com.example.projetFabrick1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetFabrick1.model.Compte;
import com.example.projetFabrick1.repository.CompteRepository;


@RestController
public class Controller {
	
	  @Autowired
	    CompteRepository compteRepository;
	    
	    @PostMapping("saveCompte")
	    public void saveCompte(@RequestBody Compte compte){
	        compteRepository.save(compte);
	    }
	    
	    @GetMapping("getCompte")
	    public List<Compte> getCompte(){
	    	return compteRepository.findAll();
	    }

}
