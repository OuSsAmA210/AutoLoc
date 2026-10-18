package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.repository.PaimentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PaimentService implements IPaiementService {

    private final PaimentRepository paimentRepository;

    @Override
    public Paiement ajouterPaiement(Paiement paiement) {
        return paimentRepository.save(paiement);
    }

    @Override
    public Paiement modifierPaiment(Paiement paiement) {
        return paimentRepository.save(paiement);
    }

    @Override
    public List<Paiement> afiicherTousPaiement() {
        return paimentRepository.findAll();
    }

    @Override
    public Paiement afficherPaiementById(Long id) {
        return paimentRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerPaiement(Long id) {
        paimentRepository.deleteById(id);
    }
}