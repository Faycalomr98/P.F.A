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
@Table(name = "Reunion")
public class Reunion {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idReunion;
//    @ManyToOne
//    @JoinColumn(name = "id_user")
//    private Utilisateur user;

}
