package tn.esprit.AutoLoc.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEmploye;

    String nom;
    String prenom;

    @Enumerated(EnumType.STRING)
    RoleEmploye role;
    @ManyToOne
    Agence agence;
}