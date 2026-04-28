package com.example.negozio.controller;

import com.example.negozio.model.OrdineModel;
import com.example.negozio.service.OrdineService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ordini")
public class OrdineController {

    private final OrdineService ordineService;

    public OrdineController(OrdineService ordineService) {
        this.ordineService = ordineService;
    }

    // GET /api/ordini
    @GetMapping
    public List<OrdineModel> listaOrdini() {
        return ordineService.listaOrdini();
    }

    // GET /api/ordini/1
    @GetMapping("/{id}")
    public OrdineModel getById(@PathVariable Long id) {
        return ordineService.getById(id);
    }

    // POST /api/ordini
    @PostMapping
    public OrdineModel crea(@RequestBody OrdineModel ordine) {
        return ordineService.createOrdine(ordine);
    }

    // PUT /api/ordini/1
    @PutMapping("/{id}")
    public OrdineModel aggiorna(@PathVariable Long id,
                                @RequestBody OrdineModel ordine) {
        return ordineService.aggiorna(id, ordine);
    }

    // DELETE /api/ordini/1
    @DeleteMapping("/{id}")
    public void elimina(@PathVariable Long id) {
        ordineService.elimina(id);
    }
}