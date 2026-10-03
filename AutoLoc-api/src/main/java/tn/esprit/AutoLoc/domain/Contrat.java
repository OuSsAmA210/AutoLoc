package tn.esprit.AutoLoc.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idContrat;

    LocalDate dateSignature;

    BigDecimal montantTotal;

    boolean valide;
    @OneToOne(mappedBy = "contrat")
    Reservation reservation;
    @OneToMany(mappedBy = "contrat" , cascade = CascadeType.ALL)
    List<Payement> payement =new ArrayList<>();
}