package com.gestion_agile.Repositories;

import com.gestion_agile.Entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepo extends JpaRepository<Projet, Integer> {
}
