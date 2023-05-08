package com.challenger.crud.controllers;

import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenger.crud.dto.AlunoDTO;
import com.challenger.crud.models.Aluno;
import com.challenger.crud.services.AlunoService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    public AlunoController(AlunoService alunoService){
        this.alunoService = alunoService;
    }

    @PostMapping("/")
    public ResponseEntity<Object> saveAluno(@RequestBody @Valid AlunoDTO alunoDTO){
        var alunoModel = new Aluno();

        BeanUtils.copyProperties(alunoDTO, alunoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.save(alunoModel));
    }

    @GetMapping("/")
    public ResponseEntity<Object> getAlunos(){
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateAluno(@PathVariable(value = "id") UUID id, @RequestBody @Valid AlunoDTO alunoDTO){
        var alunoModel = new Aluno();
        alunoModel.setId(id);
        BeanUtils.copyProperties(alunoDTO, alunoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.update(alunoModel));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteAluno(@PathVariable(value = "id") UUID id){
        alunoService.delete(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(id);
    }
}
