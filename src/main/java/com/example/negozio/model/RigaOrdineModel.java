package com.example.negozio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "righe_ordini")
public class RigaOrdineModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ordine_id")
    private OrdineModel ordine;       // ← era "ordini"

    @ManyToOne
    @JoinColumn(name = "prodotto_id")
    private ProdottoModel prodotto;

    @Column(name = "quantita")
    private Integer quantita;

    @Column(name = "prezzoUnitario")
    private Double prezzoUnitario;

    public RigaOrdineModel() {}

    public RigaOrdineModel(OrdineModel ordine, ProdottoModel prodotto, Integer quantita) {
        this.ordine = ordine;         // ← era "ordini"
        this.prodotto = prodotto;
        this.quantita = quantita;
        this.prezzoUnitario = prodotto.getPrezzo();
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public OrdineModel getOrdine() { return ordine; }        // ← era getOrdini
    public void setOrdine(OrdineModel ordine) { this.ordine = ordine; }  // ← era setOrdini

    public ProdottoModel getProdotto() { return prodotto; }
    public void setProdotto(ProdottoModel prodotto) { this.prodotto = prodotto; }

    public Integer getQuantita() { return quantita; }
    public void setQuantita(Integer quantita) { this.quantita = quantita; }

    public Double getPrezzoUnitario() { return prezzoUnitario; }
    public void setPrezzoUnitario(Double prezzoUnitario) { this.prezzoUnitario = prezzoUnitario; }
}