package com.example.negozio.controller;

import com.example.negozio.model.CategoriaModel;
import com.example.negozio.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorie")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    // GET /api/categorie
    @GetMapping
    public List<CategoriaModel> getCategorie() {
        return categoriaService.getCategorie();
    }

    // GET /api/categorie/1
    @GetMapping("/{id}")
    public CategoriaModel getById(@PathVariable Long id) {
        return categoriaService.getById(id);
    }

    // POST /api/categorie
    @PostMapping
    public CategoriaModel crea(@RequestBody CategoriaModel categoria) {
        return categoriaService.crea(categoria);
    }

    // PUT /api/categorie/1
    @PutMapping("/{id}")
    public CategoriaModel aggiorna(@PathVariable Long id,
                                   @RequestBody CategoriaModel categoria) {
        return categoriaService.aggiorna(id, categoria);
    }

    // DELETE /api/categorie/1
    @DeleteMapping("/{id}")
    public void elimina(@PathVariable Long id) {
        categoriaService.elimina(id);
    }
}