package tn.esprit.tp8_yassine_ferchichi.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp8_yassine_ferchichi.Repositories.EquipeRepo;
import tn.esprit.tp8_yassine_ferchichi.entities.Equipe;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipeService implements IEquipeService{
    EquipeRepo equipeRepo;
    @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepo.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return equipeRepo.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return equipeRepo.save(e);
    }

    @Override
    public Equipe retrieveEquipe(long idEquipe) {
        return equipeRepo.findById(idEquipe).get();
    }

    @Override
    public void removeEquipe(long idEquipe) {
        equipeRepo.deleteById(idEquipe);

    }
}
