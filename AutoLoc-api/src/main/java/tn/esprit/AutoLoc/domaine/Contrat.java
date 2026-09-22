package tn.esprit.AutoLoc.domaine;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

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
}