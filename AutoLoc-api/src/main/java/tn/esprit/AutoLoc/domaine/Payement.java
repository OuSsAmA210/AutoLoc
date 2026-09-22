package tn.esprit.AutoLoc.domaine;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Payement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPaiement;
    BigDecimal montant;
    LocalDate datePaiement;
    @Enumerated(EnumType.STRING)
    ModePayement modePaiement;

}