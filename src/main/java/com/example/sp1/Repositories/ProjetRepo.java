package com.example.sp1.Repositories;

import com.example.sp1.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepo extends JpaRepository<Projet,Integer> {
}
