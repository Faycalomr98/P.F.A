package com.gestion_agile.Services;

import com.gestion_agile.Entities.EquipeScrum;
import com.gestion_agile.Entities.Projet;
import com.gestion_agile.Repositories.EquipeRepo;
import com.gestion_agile.Repositories.ProjetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeServices {
    private final EquipeRepo equipeRepo;
    @Autowired
    public EquipeServices(EquipeRepo equipeRepo) {
        this.equipeRepo = equipeRepo;
    }

    public EquipeScrum saveequipe(EquipeScrum equipeScrum){
        return equipeRepo.save(equipeScrum);
    }

    public List<EquipeScrum> listAll() {
        return equipeRepo.findAll();
    }

    public EquipeScrum getEquipeById(Integer equipeid) {
        return equipeRepo.findById(equipeid).orElse(null);
    }
}
