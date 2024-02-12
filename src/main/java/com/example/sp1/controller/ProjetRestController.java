package com.example.sp1.controller;

import com.example.sp1.Service.IProjetService;
import com.example.sp1.entities.Projet;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("projet")
public class ProjetRestController {
    IProjetService iProjetService;

    @PostMapping("/ajouterProjet")
    public void ajouterProjet(@RequestBody Projet projet){
        iProjetService.ajouterProjet(projet);
    }
    @PutMapping("/affecterEtudiantProjet/{idEtudiant}/{idProjet}")
    public void affecterEtudiantProjet(@PathVariable("idEtudiant") int idEtudiant,@PathVariable("idProjet") int idProjet){
        iProjetService.affecterEtudiantProjet(idEtudiant,idProjet);
    }
}
