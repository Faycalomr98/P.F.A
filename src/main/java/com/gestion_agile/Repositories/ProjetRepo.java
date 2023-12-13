package com.gestion_agile.Repositories;

import com.gestion_agile.Entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepo extends JpaRepository<Projet, Integer> {
}
