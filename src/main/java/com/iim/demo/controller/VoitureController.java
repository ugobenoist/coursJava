package com.iim.demo.controller;

import com.iim.demo.model.Voiture;
import com.iim.demo.service.VoitureService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/voiture")
public class VoitureController {

    private final VoitureService voitureService;

    public VoitureController(VoitureService voitureService) {
        this.voitureService = voitureService;
    }

    @PostMapping
    public Voiture create(@RequestParam String marque, @RequestParam int vitesse) {
        return voitureService.create(marque, vitesse);
    }

    @GetMapping(params = "!id")
    public List<Voiture> findAll() {
        return voitureService.findAll();
    }

    @GetMapping(params = "id")
    public Voiture findById(@RequestParam Long id) {
        return voitureService.findById(id);
    }

    @PutMapping
    public Voiture update(@RequestParam Long id, @RequestParam String marque, @RequestParam int vitesse) {
        return voitureService.update(id, marque, vitesse);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id) {
        voitureService.delete(id);
    }
}
