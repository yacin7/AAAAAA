package com.example.sp1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tuteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTuteur;
    private String nomTuteur;
    @OneToOne
    private Etudiant etudiant;
}
