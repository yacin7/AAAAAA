package tn.esprit.tp8_yassine_ferchichi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class ProjetDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String description;
    String technologie;
    Long cout;
    @Temporal(TemporalType.DATE)
    Date dateDebut;
    @OneToOne(mappedBy = "projetDetail")
    Projet projet;


}
