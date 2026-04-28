package com.example.negozio.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ordini")
public class OrdineModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dataOrdine")
    private LocalDate dataOrdine;

    @Column(name = "totale")
    private Double totale;

    @OneToMany(mappedBy = "ordine", cascade = CascadeType.ALL)
    private List<RigaOrdineModel> righe = new ArrayList<>();

    public OrdineModel() {}

    public OrdineModel(LocalDate dataOrdine, Double totale) {
        this.dataOrdine = dataOrdine;
        this.totale = totale;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getDataOrdine() { return dataOrdine; }
    public void setDataOrdine(LocalDate dataOrdine) { this.dataOrdine = dataOrdine; }

    public Double getTotale() { return totale; }
    public void setTotale(Double totale) { this.totale = totale; }

    public List<RigaOrdineModel> getRighe() { return righe; }
    public void setRighe(List<RigaOrdineModel> righe) { this.righe = righe; }
}