package com.gestion_agile.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(name = "Projet")
    public class Projet {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private long idProjet;
        private String NomProjet;
        private String Description;
        private Date DateDebut;
        private Date DateFin;
        private int Active;
//        @ManyToMany
//        private List<Utilisateur> user= new ArrayList<>();
//        @ManyToOne
//        @JoinColumn(name = "id_userstory")
//        private Userstory userstory;
}
