package com.iim.demo.service;

import com.iim.demo.model.Voiture;
import com.iim.demo.repository.VoitureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoitureService {

    private final VoitureRepository voitureRepository;

    public VoitureService(VoitureRepository voitureRepository) {
        this.voitureRepository = voitureRepository;
    }

    public Voiture create(String marque, int vitesse) {
        return voitureRepository.save(new Voiture(marque, vitesse));
    }

    public List<Voiture> findAll() {
        return voitureRepository.findAll();
    }

    public Voiture findById(Long id) {
        return voitureRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Voiture introuvable"));
    }

    public Voiture update(Long id, String marque, int vitesse) {
        Voiture voiture = findById(id);
        voiture.setMarque(marque);
        voiture.setVitesse(vitesse);
        return voitureRepository.save(voiture);
    }

    public void delete(Long id) {
        voitureRepository.delete(findById(id));
    }
}
