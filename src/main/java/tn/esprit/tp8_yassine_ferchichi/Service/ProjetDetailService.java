package tn.esprit.tp8_yassine_ferchichi.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp8_yassine_ferchichi.Repositories.ProjetDetailRepo;
import tn.esprit.tp8_yassine_ferchichi.entities.ProjetDetail;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjetDetailService implements IProjetDetailService{
    ProjetDetailRepo projetDetailRepo;
    @Override
    public List<ProjetDetail> retrieveAllProjetDetails() {
        return projetDetailRepo.findAll();
    }

    @Override
    public ProjetDetail addProjetDetail(ProjetDetail p) {
        return projetDetailRepo.save(p);
    }

    @Override
    public ProjetDetail updateProjetDetail(ProjetDetail p) {
        return projetDetailRepo.save(p);
    }

    @Override
    public ProjetDetail retrieveProjetDetail(long idProjetDetail) {
        return projetDetailRepo.findById(idProjetDetail).get();
    }

    @Override
    public void removeProjetDetail(long idProjetDetail) {
        projetDetailRepo.deleteById(idProjetDetail);

    }

}
