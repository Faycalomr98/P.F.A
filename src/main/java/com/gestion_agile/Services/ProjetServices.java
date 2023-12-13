package com.gestion_agile.Services;

import com.gestion_agile.Entities.Projet;
import com.gestion_agile.Entities.Utilisateur;
import com.gestion_agile.Repositories.ProjetRepo;
import com.gestion_agile.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjetServices {
    private final ProjetRepo projetRepo;
    @Autowired
    public ProjetServices(ProjetRepo projetRepo) {
        this.projetRepo = projetRepo;
    }

    public Projet saveprojet(Projet projet){
        return projetRepo.save(projet);
    }

    public Iterable<Projet> listAll() {
        return projetRepo.findAll();
    }

    public Projet getProjetById(Integer projetId) {
        return projetRepo.findById(projetId).orElse(null);
    }
}
