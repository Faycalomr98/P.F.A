package com.gestion_agile.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Backlog")
public class Backlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBacklog;
//    @ManyToOne
//    @JoinColumn(name = "id_userstory")
//    private Userstory userstory;
//    @ManyToOne
//    @JoinColumn(name = "id_sprint")
//    private Sprint sprint ;
    
}
