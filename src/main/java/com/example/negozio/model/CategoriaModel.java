package com.example.negozio.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categorie")
public class CategoriaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomeCategoria")
    private String nome;

    @Column(name = "descrizioneCategoria")
    private String descrizione;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<ProdottoModel> prodotti;

    public CategoriaModel() {
    }

    public CategoriaModel(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public List<ProdottoModel> getProdotti() {
        return prodotti;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setProdotti(List<ProdottoModel> prodotti) {
        this.prodotti = prodotti;
    }
}
