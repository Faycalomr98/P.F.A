package com.gestion_agile.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idUtilisateur;
    private String NomUtilisateur;
//    @ManyToMany(mappedBy = "user")
//    private List<Projet> projets= new ArrayList<>();
//    @OneToMany(mappedBy = "user")
//    private List<EquipeScrum> equipeScrums= new ArrayList<>();
//    @OneToMany(mappedBy = "user")
//    private List<Reunion> reunions= new ArrayList<>();
}

