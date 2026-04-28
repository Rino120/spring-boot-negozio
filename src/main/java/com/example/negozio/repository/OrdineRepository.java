package com.example.negozio.repository;

import com.example.negozio.model.OrdineModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdineRepository extends JpaRepository<OrdineModel, Long> {
}