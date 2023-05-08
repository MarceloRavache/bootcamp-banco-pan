package com.challenger.crud.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;

public class MatriculaDTO {
    @NotBlank
    private LocalDateTime dataDaMatricula;
}
