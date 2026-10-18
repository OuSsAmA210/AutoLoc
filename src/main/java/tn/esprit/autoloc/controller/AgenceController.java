package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceController {

    private final IAgenceService agenceService;

    @GetMapping("/afficherToutesAgences")
    public List<Agence> getAllAgences() {
        return agenceService.afficherTousAgence();
    }

    @GetMapping("/afficherAgence/{id}")
    public Agence getAgenceById(@PathVariable Long id) {
        return agenceService.afficherAgenceById(id);
    }

    @PostMapping("/ajouterAgence")
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.ajouerAgence(agence);
    }

    @PutMapping("/modifierAgence")
    public Agence modifierAgence(@RequestBody Agence agence) {
        return agenceService.modifierAgence(agence);
    }

    @DeleteMapping("/supprimerAgence/{id}")
    public void supprimerAgence(@PathVariable Long id) {
        agenceService.supprimerAgence(id);
    }
}