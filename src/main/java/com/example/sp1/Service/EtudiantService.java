package com.example.sp1.Service;

import com.example.sp1.Repositories.EtudiantRepo;
import com.example.sp1.entities.Etudiant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{
    EtudiantRepo etudiantRepo;
    @Override
    public void ajouterEtudiant(Etudiant etudiant){
        etudiantRepo.save(etudiant);
    }

}
