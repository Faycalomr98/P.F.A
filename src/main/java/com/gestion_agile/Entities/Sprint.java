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
@Table(name = "sprint")
public class Sprint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSprint;
    private int NumeroSprint;
    private Date DateDebut;
    private Date DateFin;
    private int Etat;

//    @OneToMany(mappedBy = "sprint")
//    private List<EquipeScrum> equipeScrums= new ArrayList<>();
//
//    @OneToMany(mappedBy = "sprint", cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
//    private List<Backlog> backlogs;

}
