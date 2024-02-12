package tn.esprit.tp8_yassine_ferchichi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp8_yassine_ferchichi.entities.Equipe;

@Repository
public interface EquipeRepo extends JpaRepository<Equipe,Long> {
}
