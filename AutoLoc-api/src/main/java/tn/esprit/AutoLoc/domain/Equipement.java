package tn.esprit.AutoLoc.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEquipement;

    String libelle;
    @ManyToMany(mappedBy = "equipement")
    List<Vehicule> vehicule =new ArrayList<>();


}