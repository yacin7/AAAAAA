package tn.esprit.tp8_yassine_ferchichi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp8_yassine_ferchichi.Service.IProjetService;
import tn.esprit.tp8_yassine_ferchichi.entities.Projet;

import java.util.List;
@RestController
@RequestMapping("/projet")
public class ProjetRestController {

    @Autowired
    IProjetService iProjetService;
    @GetMapping("/affichertout")
    public List<Projet> retrieveAllProjets(){

        return iProjetService.retreiveAllProjects();
    }
    @PostMapping("/ajouterprojet")
    public Projet addProjet(@RequestBody Projet f){

        return iProjetService.addProjet(f);
    }
    @PutMapping("/modifierProjet")
    public Projet updateProjet(@RequestBody Projet f){
        return iProjetService.updateProjet(f);
    }
    @GetMapping("/afficherProjet/{idProjet}")
    public Projet retrieveProjet(@PathVariable("idProjet") long idProjet) {
        return iProjetService.retrieveProjet(idProjet);
    }

    @DeleteMapping("/supprimerProjet/{idProjet}")
    public void removeProjet(@PathVariable("idProjet") long idProjet) {

        iProjetService.removeProjet(idProjet);
    }
    @PostMapping("/ajouter-projet-et-projet-detail")
    public Projet addProjetAndProjetDetail(@RequestBody Projet p){
     Projet projet= iProjetService.addProjetAndProjetDetailAndAssign(p);
     return projet;
}
    @PutMapping("/affecter-projet-a-projet-details/{projet-id}/{projet-details-id}")
    public void affecgterProjetAProjetDetail(@PathVariable("projet-id")Long proejtId,@PathVariable("projet-details-id") Long proejtDetailsId){
        iProjetService.assignProjetDetailToProjet(proejtId,proejtDetailsId);
    }

    @PutMapping("/affecter-projet/{projet-id}/{equipeId}")
    public void assignProjetToEquipe(@PathVariable("projet-id")Long projetId,@PathVariable("equipeId")Long equipeId) {
        iProjetService.assignProjetToEquipe(projetId,equipeId);
    }
    @PutMapping("/affecter-projet/{projet-details-id}")
    public Projet addProjetAndAssignProjetToProjetDetail(Projet projet,@PathVariable("projet-details-id") Long proejtDetailsId){
        return iProjetService.addProjetAndAssignProjetToProjetDetail(projet,proejtDetailsId);
    }
    @PutMapping("/desaffecter-projet-detail/{projetId}")
    public Projet DesaffecterProjetDetailFromProjet(@PathVariable("projetId") Long projetId) {
        Projet projet = iProjetService.DesaffecterProjetDetailFromProjet(projetId);
        return projet;
    }
    @PutMapping("desaffecter-projet-de-equipe/{projet-id}/{equipeId}")
    public void desaffecterProjetFromEquipe(@PathVariable("projet-id") Long projetId,@PathVariable("equipeId") Long equipeId) {
        iProjetService.desaffecterProjetFromEquipe(projetId,equipeId);
    }

}
