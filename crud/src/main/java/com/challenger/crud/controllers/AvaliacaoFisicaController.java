package com.challenger.crud.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenger.crud.dto.AvaliacaoFisicaDTO;
import com.challenger.crud.models.AvaliacaoFisica;
import com.challenger.crud.services.AvaliacaoService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/avaliacao-fisica")
public class AvaliacaoFisicaController {
    
    @Autowired
    AvaliacaoService avaliacaoFisicaService;

    @PostMapping("/aluno/{id}")
    public ResponseEntity<Object> saveAvaliacaoFisica(@PathVariable(value = "id") UUID id, @RequestBody @Valid AvaliacaoFisicaDTO avaliacaoFisicaDTO){
        var avaliacaoFisicaModel = new AvaliacaoFisica();
        BeanUtils.copyProperties(avaliacaoFisicaDTO, avaliacaoFisicaModel);
        avaliacaoFisicaModel.setDataDaAvaliacao(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(avaliacaoFisicaService.save(avaliacaoFisicaModel, id));
    }

    @GetMapping("/")
    public ResponseEntity<Object> getAvaliacoes(){
        return ResponseEntity.status(HttpStatus.CREATED).body(avaliacaoFisicaService.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateAvaliacaoFisica(@PathVariable(value = "id") UUID id, @RequestBody @Valid AvaliacaoFisicaDTO avaliacaoFisicaDTO){
        var avaliacaoFisicaModel = new AvaliacaoFisica();
        avaliacaoFisicaModel.setId(id);
        BeanUtils.copyProperties(avaliacaoFisicaDTO, avaliacaoFisicaModel);
        avaliacaoFisicaModel.setDataDaAvaliacao(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(avaliacaoFisicaService.update(avaliacaoFisicaModel));
    }
}
