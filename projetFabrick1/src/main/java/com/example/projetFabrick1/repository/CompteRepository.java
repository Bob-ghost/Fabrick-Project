package com.example.projetFabrick1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetFabrick1.model.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}
