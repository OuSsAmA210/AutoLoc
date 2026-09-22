package tn.esprit.AutoLoc.domaine;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idClient;

    String nom;
    String prenom;
    String email;
    String telephone;
    String numPermis;

    LocalDate dateInscription;
}