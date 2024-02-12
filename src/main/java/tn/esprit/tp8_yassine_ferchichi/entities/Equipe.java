package tn.esprit.tp8_yassine_ferchichi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long equipeId;
        String nom;
    @Enumerated(EnumType.STRING)
    Domaine domaine;
    @ManyToMany()
    List<Projet> projets;

}
