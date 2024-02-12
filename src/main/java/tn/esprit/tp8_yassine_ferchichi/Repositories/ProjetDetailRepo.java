package tn.esprit.tp8_yassine_ferchichi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp8_yassine_ferchichi.entities.ProjetDetail;

@Repository
public interface ProjetDetailRepo extends JpaRepository<ProjetDetail,Long> {
}
