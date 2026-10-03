package tn.esprit.AutoLoc.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idAgence;

    String nom;
    String ville;
    String adresse;
    String telephone;

    @OneToMany(mappedBy = "agence")
    List<Employe> employes;

    @OneToMany(mappedBy = "agence")
    List<Vehicule> vehicules;
}
