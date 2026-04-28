package com.example.negozio.controller;

import com.example.negozio.model.ProdottoModel;
import com.example.negozio.service.ProdottoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prodotti")
public class ProdottoController {

    private final ProdottoService prodottoService;

    public ProdottoController(ProdottoService prodottoService) {
        this.prodottoService = prodottoService;
    }

    @GetMapping
    public List<ProdottoModel> getTutti() {
        return prodottoService.getTutti();
    }

    @GetMapping("/{id}")
    public ProdottoModel getById(@PathVariable("id") long id) {
        return prodottoService.getById(id);
    }

    @PostMapping
    public ProdottoModel create(@RequestBody ProdottoModel prodottoModel) {
        return prodottoService.crea(prodottoModel);
    }

    @PutMapping("/{id}")
    public ProdottoModel update(@PathVariable("id") long id, @RequestBody ProdottoModel prodottoModel) {
        return prodottoService.aggiorna(id, prodottoModel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        prodottoService.elimina(id);
    }
}