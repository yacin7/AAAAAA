package tn.esprit.tp8_yassine_ferchichi.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp8_yassine_ferchichi.entities.Projet;

import java.util.List;


public interface IProjetService {


    List<Projet> retreiveAllProjects();

    Projet addProjet(Projet p);

    Projet updateProjet(Projet p);

    Projet retrieveProjet(long idProjet);

    void removeProjet(long idProjet);

    Projet addProjetAndProjetDetailAndAssign(Projet projet);

    void assignProjetDetailToProjet(Long projetId, Long projetDetailId);

    void assignProjetToEquipe(Long projetId, Long equipeId);

    Projet addProjetAndAssignProjetToProjetDetail(Projet projet, Long projetDetailId);

    Projet DesaffecterProjetDetailFromProjet(Long projetId);

    void desaffecterProjetFromEquipe(Long projetId, Long equipeId);
}
