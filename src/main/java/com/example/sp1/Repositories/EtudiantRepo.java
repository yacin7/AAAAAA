package com.example.sp1.Repositories;

import com.example.sp1.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepo extends JpaRepository<Etudiant,Integer> {
}
