package com.gestion_agile.Repositories;

import com.gestion_agile.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepo extends JpaRepository<Utilisateur,Integer> {
//  Optional<Utilisateur> findByNomUtilisateurAndPassword(String name, String password);
}
