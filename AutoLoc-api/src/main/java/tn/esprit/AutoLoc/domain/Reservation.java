package tn.esprit.AutoLoc.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idReservation;

    LocalDate dateDebut;
    LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    StatutReservation statut;
    @OneToOne
    Contrat contrat;
    @ManyToOne
    Client client;
    @ManyToOne
    Vehicule vehicule;

}