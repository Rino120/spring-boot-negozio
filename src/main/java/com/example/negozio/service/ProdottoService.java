package com.example.negozio.service;

import com.example.negozio.model.ProdottoModel;
import com.example.negozio.repository.ProdottoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdottoService {

    private final ProdottoRepository prodottoRepository;

    public ProdottoService(ProdottoRepository prodottoRepository) {
        this.prodottoRepository = prodottoRepository;
    }

    public List<ProdottoModel> getTutti() {
        return prodottoRepository.findAll();
    }

    public ProdottoModel getById(Long id) {
        return prodottoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Prodotto non trovato con id: " + id));
    }

    public ProdottoModel crea(ProdottoModel prodotto) {
        return prodottoRepository.save(prodotto);
    }

    public ProdottoModel aggiorna(Long id, ProdottoModel datiNuovi) {
        ProdottoModel esistente = getById(id);
        esistente.setNome(datiNuovi.getNome());
        esistente.setDescrizione(datiNuovi.getDescrizione());
        esistente.setPrezzo(datiNuovi.getPrezzo());
        return prodottoRepository.save(esistente);
    }

    // DELETE
    public void elimina(Long id) {
        getById(id);
        prodottoRepository.deleteById(id);
    }
}