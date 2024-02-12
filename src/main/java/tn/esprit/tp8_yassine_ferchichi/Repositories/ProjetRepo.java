package tn.esprit.tp8_yassine_ferchichi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp8_yassine_ferchichi.entities.Projet;

@Repository
public interface ProjetRepo extends JpaRepository<Projet,Long> {

}
