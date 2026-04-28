package com.example.negozio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "prodotti")
public class ProdottoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProdotto;

    @Column(name = "nomeProdotto")
    private String nome;

    @Column(name = "descrizioneProdotto")
    private String descrizione;

    @Column(name = "prezzoProdotto")
    private Double prezzo;

    public ProdottoModel() {
    }

    public ProdottoModel(String nome, String descrizione, Double prezzo) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
    private CategoriaModel categoria;

    public CategoriaModel getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaModel categoria) {
        this.categoria = categoria;
    }

    public Long getIdProdotto() {
        return idProdotto;
    }

    public void setIdProdotto(Long idProdotto) {
        this.idProdotto = idProdotto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }
}