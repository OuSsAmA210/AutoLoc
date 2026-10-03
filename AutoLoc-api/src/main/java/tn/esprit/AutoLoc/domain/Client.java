package tn.esprit.AutoLoc.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

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
    @OneToMany(mappedBy = "client")
    List<Reservation> reservations;

}