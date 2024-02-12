package tn.esprit.tp8_yassine_ferchichi.Service;

import tn.esprit.tp8_yassine_ferchichi.entities.Equipe;

import java.util.List;

public interface IEquipeService {
    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e);

    Equipe updateEquipe(Equipe e);

    Equipe retrieveEquipe(long idEquipe);

    void removeEquipe(long idEquipe);
}
