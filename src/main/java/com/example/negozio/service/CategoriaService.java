package com.example.negozio.service;

import com.example.negozio.model.CategoriaModel;
import com.example.negozio.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<CategoriaModel> getCategorie() {
        return categoriaRepository.findAll();
    }

    public CategoriaModel getById(Long id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria non trovata con id: " + id));
    }

    public CategoriaModel crea(CategoriaModel categoria) {
        return categoriaRepository.save(categoria);
    }

    public CategoriaModel aggiorna(Long id, CategoriaModel categoria) {
        CategoriaModel esistente = getById(id);
        esistente.setNome(categoria.getNome());
        esistente.setDescrizione(categoria.getDescrizione());
        return categoriaRepository.save(esistente);
    }

    public void elimina(Long id) {
        getById(id);
        categoriaRepository.deleteById(id);
    }
}