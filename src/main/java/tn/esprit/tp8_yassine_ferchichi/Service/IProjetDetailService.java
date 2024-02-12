package tn.esprit.tp8_yassine_ferchichi.Service;

import tn.esprit.tp8_yassine_ferchichi.entities.ProjetDetail;

import java.util.List;

public interface IProjetDetailService {
    List<ProjetDetail> retrieveAllProjetDetails();

    ProjetDetail addProjetDetail(ProjetDetail p);

    ProjetDetail updateProjetDetail(ProjetDetail p);

    ProjetDetail retrieveProjetDetail(long idProjetDetail);

    void removeProjetDetail(long idProjetDetail);
}
