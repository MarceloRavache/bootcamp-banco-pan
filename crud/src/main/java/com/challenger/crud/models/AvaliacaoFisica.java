package com.challenger.crud.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_AVALIACAO_FISICA")
public class AvaliacaoFisica implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private Integer peso;

    @Column(nullable = false)
    private Integer altura;
    
    @Column(columnDefinition = "DATE")
    private LocalDateTime dataDaAvaliacao;

    @OneToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;


    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getPeso() {
        return this.peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getAltura() {
        return this.altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public LocalDateTime getDataDaAvaliacao() {
        return this.dataDaAvaliacao;
    }

    public void setDataDaAvaliacao(LocalDateTime dataDaAvaliacao) {
        this.dataDaAvaliacao = dataDaAvaliacao;
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
}
