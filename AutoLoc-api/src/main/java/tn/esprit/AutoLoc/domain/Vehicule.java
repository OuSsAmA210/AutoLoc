package tn.esprit.AutoLoc.domain;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    private String immatriculation;
    private String marque;
    private String modele;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;

    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;
    @ManyToMany(fetch = FetchType.EAGER)
    List<Equipement> equipement =new ArrayList<>();
    @OneToMany(mappedBy = "vehicule")
    List<Reservation> reservations;
    @ManyToOne
    Agence agence;
    @OneToMany(mappedBy = "vehicule")
    List<Maintenance> maintenances;
}