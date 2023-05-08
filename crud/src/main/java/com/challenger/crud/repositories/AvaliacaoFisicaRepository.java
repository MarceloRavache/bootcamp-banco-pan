package com.challenger.crud.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenger.crud.models.AvaliacaoFisica;;

@Repository
public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, UUID> {
    
}
