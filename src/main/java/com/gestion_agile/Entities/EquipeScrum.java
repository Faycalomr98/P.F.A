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
@Table(name = "EquipeScrum")
public class EquipeScrum {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idEquipe;
//    @ManyToOne
//    @JoinColumn(name = "id_user")
//    private Utilisateur user;
//    @ManyToOne
//    @JoinColumn(name = "id_sprint")
//    private Sprint sprint;

}
