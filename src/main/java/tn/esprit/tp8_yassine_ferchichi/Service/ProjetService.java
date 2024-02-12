package tn.esprit.tp8_yassine_ferchichi.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp8_yassine_ferchichi.Repositories.EquipeRepo;
import tn.esprit.tp8_yassine_ferchichi.Repositories.ProjetDetailRepo;
import tn.esprit.tp8_yassine_ferchichi.Repositories.ProjetRepo;
import tn.esprit.tp8_yassine_ferchichi.entities.Equipe;
import tn.esprit.tp8_yassine_ferchichi.entities.Projet;
import tn.esprit.tp8_yassine_ferchichi.entities.ProjetDetail;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjetService implements IProjetService{
    ProjetRepo projetRepo;
    ProjetDetailRepo projetDetailRepo;
    EquipeRepo equipeRepo;
    @Override
    public List<Projet> retreiveAllProjects(){
        return projetRepo.findAll();
    }
    @Override
    public Projet addProjet(Projet p) {
        return projetRepo.save(p);
    }

    @Override
    public Projet updateProjet(Projet p) {
        return projetRepo.save(p);
    }

    @Override
    public Projet retrieveProjet(long idProjet) {
        return projetRepo.findById(idProjet).get();
    }

    @Override
    public void removeProjet(long idProjet) {
        projetRepo.deleteById(idProjet);

    }
    @Override
    public Projet addProjetAndProjetDetailAndAssign(Projet projet){
        return projetRepo.save(projet);
    }
@Override
    public void assignProjetDetailToProjet(Long projetId, Long projetDetailId){
        Projet projet = projetRepo.findById(projetId).get();
        ProjetDetail projetDetail = projetDetailRepo.findById(projetDetailId).get();
        projet.setProjetDetail(projetDetail);
        projetRepo.save(projet);
    }

    @Override
    public void assignProjetToEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepo.findById(projetId).get();
        Equipe equipe =equipeRepo.findById(equipeId).get();
        equipe.getProjets().add(projet);
        equipeRepo.save(equipe);
        }
    @Override
    public Projet addProjetAndAssignProjetToProjetDetail(Projet projet, Long projetDetailId){
        ProjetDetail projetDetail = projetDetailRepo.findById(projetDetailId).get();
        projet.setProjetDetail(projetDetail);
        return projetRepo.save(projet);
    }
    @Override
    public Projet DesaffecterProjetDetailFromProjet(Long projetId) {
        Projet projet = projetRepo.findById(projetId).get();
        projet.setProjetDetail(null);
        return projetRepo.save(projet);
    }
    @Override
    public void desaffecterProjetFromEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepo.findById(projetId).get();
        Equipe equipe = equipeRepo.findById(equipeId).get();
        equipe.getProjets().remove(projet);
        equipeRepo.save(equipe);
    }
}
