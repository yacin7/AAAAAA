package tn.esprit.tp8_yassine_ferchichi.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.tp8_yassine_ferchichi.Service.IProjetDetailService;
import tn.esprit.tp8_yassine_ferchichi.Service.ProjetDetailService;
import tn.esprit.tp8_yassine_ferchichi.entities.ProjetDetail;

import java.util.List;
@RestController
@RequestMapping("/projetdetail")
public class ProjetDetailRestController {
    IProjetDetailService iProjetDetailService;
    @GetMapping("/affichertout")
    public List<ProjetDetail> retrieveAllProjetDetails(){

        return iProjetDetailService.retrieveAllProjetDetails();
    }
    @PostMapping("/ajouterProjetDetail")
    public ProjetDetail addProjetDetail(@RequestBody ProjetDetail f){

        return iProjetDetailService.addProjetDetail(f);
    }
    @PutMapping("/modifierProjetDetail")
    public ProjetDetail updateProjetDetail(@RequestBody ProjetDetail f){

        return iProjetDetailService.updateProjetDetail(f);
    }
    @GetMapping("/afficherProjetDetail/{idProjetDetail}")
    public ProjetDetail retrieveProjetDetail(@PathVariable("idProjetDetail") long idProjetDetail) {
        return iProjetDetailService.retrieveProjetDetail(idProjetDetail);
    }

    @DeleteMapping("/supprimerProjetDetail/{idProjetDetail}")
    public void removeProjetDetail(@PathVariable("idProjetDetail") long idProjetDetail) {

        iProjetDetailService.removeProjetDetail(idProjetDetail);
    }

}
