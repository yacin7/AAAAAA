package com.example.sp1.Service;

import com.example.sp1.entities.Projet;

public interface IProjetService {
    void ajouterProjet(Projet projet);

    void affecterEtudiantProjet(int idEtudiant, int idProjet);
}
