package com.example.sp1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEtudiant;
    private String login;
    private String password;
    private Specialite specialite;
    @OneToOne(mappedBy = "etudiant")
    private Tuteur tuteur;
    @ManyToMany
    private Set<Projet>projets;

}
