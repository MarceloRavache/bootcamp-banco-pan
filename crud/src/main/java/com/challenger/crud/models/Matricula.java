package com.challenger.crud.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_MATRICULA")
public class Matricula implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(columnDefinition = "DATE")
    private LocalDateTime dataDaMatricula;
    
    @OneToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getDataDaMatricula() {
        return this.dataDaMatricula;
    }

    public void setDataDaMatricula(LocalDateTime dataDaMatricula) {
        this.dataDaMatricula = dataDaMatricula;
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}
