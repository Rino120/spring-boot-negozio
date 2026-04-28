# Spring Boot Negozio API

REST API per la gestione di un negozio online, sviluppata con Spring Boot e Spring Data JPA.

## Tecnologie
- Java 17
- Spring Boot 3.3
- Spring Data JPA
- H2 Database (in memoria)

## Entità e relazioni
- Categoria → un prodotto appartiene a una categoria (@ManyToOne)
- Prodotto → un prodotto può stare in più ordini
- Ordine → un ordine contiene più prodotti tramite RigaOrdine (@OneToMany)

### Categorie
| Metodo | URL | Descrizione |
|--------|-----|-------------|
| GET | /api/categorie | Lista tutte le categorie |
| GET | /api/categorie/{id} | Trova categoria per id |
| POST | /api/categorie | Crea nuova categoria |
| PUT | /api/categorie/{id} | Aggiorna categoria |
| DELETE | /api/categorie/{id} | Elimina categoria |

### Prodotti
| Metodo | URL | Descrizione |
|--------|-----|-------------|
| GET | /api/prodotti | Lista tutti i prodotti |
| GET | /api/prodotti/{id} | Trova prodotto per id |
| POST | /api/prodotti | Crea nuovo prodotto |
| PUT | /api/prodotti/{id} | Aggiorna prodotto |
| DELETE | /api/prodotti/{id} | Elimina prodotto |

### Ordini
| Metodo | URL | Descrizione |
|--------|-----|-------------|
| GET | /api/ordini | Lista tutti gli ordini |
| GET | /api/ordini/{id} | Trova ordine per id |
| POST | /api/ordini | Crea nuovo ordine |
| PUT | /api/ordini/{id} | Aggiorna ordine |
| DELETE | /api/ordini/{id} | Elimina ordine |

## Come avviare
1. Clona il repository
2. Apri con IntelliJ IDEA
3. Avvia `NegozioApplication`
4. API disponibile su `http://localhost:8080`
