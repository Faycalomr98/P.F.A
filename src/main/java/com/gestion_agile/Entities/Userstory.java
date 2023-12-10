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
@Table(name = "Userstory")
public class Userstory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUserstory;

    private String description;

    private Integer priorite;
    private int Etat;


//    @OneToMany(mappedBy = "userstory",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Projet> projets= new ArrayList<>();
//
//    @OneToMany(mappedBy = "userstory", cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
//    private List<Backlog> backlogs;

}
