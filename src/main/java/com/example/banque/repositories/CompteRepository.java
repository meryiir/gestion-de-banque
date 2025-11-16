package com.example.banque.repositories;

import com.example.banque.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface CompteRepository extends JpaRepository<Compte, Long> {
}
