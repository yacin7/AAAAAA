package com.example.sp1.Service;

import com.example.sp1.Repositories.EtudiantRepo;
import com.example.sp1.Repositories.ProjetRepo;
import com.example.sp1.entities.Etudiant;
import com.example.sp1.entities.Projet;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjetService implements IProjetService{
    ProjetRepo projetRepo;
    EtudiantRepo etudiantRepo;
    @Override
    public void ajouterProjet(Projet projet){
        projetRepo.save(projet);
    }
    @Override
    public void affecterEtudiantProjet(int idEtudiant, int idProjet) {
        Projet projet =projetRepo.findById(idProjet).get();
        Etudiant etudiant = etudiantRepo.findById(idEtudiant).get();
        projet.getEtudiants().add(etudiant);
        projetRepo.save(projet);
    }
}
