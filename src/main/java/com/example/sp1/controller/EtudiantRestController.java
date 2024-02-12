package com.example.sp1.controller;

import com.example.sp1.Service.IEtudiantService;
import com.example.sp1.entities.Etudiant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("etudiant")
public class EtudiantRestController {
    IEtudiantService iEtudiantService;

    @PostMapping("/ajouterEtudiant")
    public void ajouterEtudiant(@RequestBody Etudiant etudiant){
        iEtudiantService.ajouterEtudiant(etudiant);
    }
}
