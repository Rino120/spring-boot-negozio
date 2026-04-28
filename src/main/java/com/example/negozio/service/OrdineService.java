package com.example.negozio.service;

import com.example.negozio.model.OrdineModel;
import com.example.negozio.repository.OrdineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdineService {

    private final OrdineRepository ordineRepository;

    public OrdineService(OrdineRepository ordineRepository) {
        this.ordineRepository = ordineRepository;
    }

    public List<OrdineModel> listaOrdini() {
        return ordineRepository.findAll();
    }

    public OrdineModel getById(Long id) {
        return ordineRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ordine non trovato con id: " + id));
    }

    public OrdineModel createOrdine(OrdineModel ordine) {
        return ordineRepository.save(ordine);
    }

    public OrdineModel aggiorna(Long id, OrdineModel datiNuovi) {
        OrdineModel esistente = getById(id);
        esistente.setDataOrdine(datiNuovi.getDataOrdine());
        esistente.setTotale(datiNuovi.getTotale());
        return ordineRepository.save(esistente);
    }

    public void elimina(Long id) {
        getById(id);
        ordineRepository.deleteById(id);
    }
}