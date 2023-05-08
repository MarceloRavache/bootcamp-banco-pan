package com.challenger.crud.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AlunoDTO {
    
    @NotBlank
    private String nome;

    @NotBlank
    @Size(min = 11, max = 11)
    private String cpf;

    @NotBlank
    private String bairro;

    @NotBlank
    private LocalDateTime dataDeNascimento;

    @JsonProperty("avalicaoFisica")
    private AvaliacaoFisicaDTO avaliacaoFisicaDTO;

    @JsonProperty("matricula")
    private MatriculaDTO matriculaDTO;
}
