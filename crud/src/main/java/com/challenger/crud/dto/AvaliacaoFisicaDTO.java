package com.challenger.crud.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;

public class AvaliacaoFisicaDTO {
    @NotBlank
    private Integer peso;

    @NotBlank
    private Integer altura;
    
    @NotBlank
    private LocalDateTime dataDaAvaliacao;
}
