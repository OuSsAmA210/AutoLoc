package tn.esprit.AutoLoc.domaine;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idMaintenance;

    LocalDate dateDebut;
    LocalDate dateFin;
    String description;
}