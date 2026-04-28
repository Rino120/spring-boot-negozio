package com.example.negozio.repository;

import com.example.negozio.model.ProdottoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdottoRepository extends JpaRepository<ProdottoModel, Long> {
}