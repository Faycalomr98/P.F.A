package com.gestion_agile.Repositories;

import com.gestion_agile.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<Utilisateur,Integer> {
  Optional<Utilisateur> findByNomUtilisateurAndPassword(String name, String password);
}
