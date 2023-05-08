package com.challenger.crud.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenger.crud.models.Matricula;
import com.challenger.crud.repositories.MatriculaRepository;

import jakarta.transaction.Transactional;

@Service
public class MatriculaService {
    @Autowired
    MatriculaRepository matriculaRepository;

    @Transactional
    public Matricula save(Matricula matricula){
        matriculaRepository.save(matricula);
        return matricula;
    }

    @Transactional
    public List<Matricula> getAll(){
        List<Matricula> matriculas = matriculaRepository.findAll();
        return matriculas;
    }

    @Transactional
    public void delete(UUID id){
        matriculaRepository.deleteById(id);
    }

    @Transactional
    public Matricula update(Matricula matricula){
        Optional<Matricula> matriculaExist = matriculaRepository.findById(matricula.getId());
        if (matriculaExist.isPresent()) {
            Matricula objeto = matriculaExist.get();
            
            objeto.setDataDaMatricula(matricula.getDataDaMatricula());
            objeto.setAluno(matricula.getAluno());
            
            matriculaRepository.save(objeto);
            return objeto;
        }
        throw new Error("Matricula Não Existe!");
    }
}
