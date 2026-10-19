package tn.esprit.autoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
@Tag(name = "Contrat", description = "API de gestion des contrats")
public class ContratController {

    private final IContratService contratService;

    @GetMapping("/afficherTousContrats")
    @Operation(summary = "Afficher tous les contrats")
    public List<Contrat> getAllContrats() {
        return contratService.afficherTousContrats();
    }

    @GetMapping("/afficherContrat/{id}")
    @Operation(summary = "Afficher un contrat par son identifiant")
    public Contrat getContratById(@PathVariable Long id) {
        return contratService.afficherContratById(id);
    }

    @PostMapping("/ajouterContrat")
    @Operation(summary = "Ajouter un nouveau contrat")
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return contratService.ajouterContrat(contrat);
    }

    @PutMapping("/modifierContrat")
    @Operation(summary = "Modifier un contrat")
    public Contrat modifierContrat(@RequestBody Contrat contrat) {
        return contratService.modifierContrat(contrat);
    }

    @DeleteMapping("/supprimerContrat/{id}")
    @Operation(summary = "Supprimer un contrat")
    public void supprimerContrat(@PathVariable Long id) {
        contratService.supprimerContrat(id);
    }
}