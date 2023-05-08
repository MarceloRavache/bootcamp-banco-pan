package com.challenger.crud.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenger.crud.models.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, UUID> {
    
}
