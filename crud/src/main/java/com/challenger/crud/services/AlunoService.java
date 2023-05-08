package com.challenger.crud.services;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenger.crud.models.Aluno;
import com.challenger.crud.models.Matricula;
import com.challenger.crud.repositories.AlunoRepository;
import com.challenger.crud.repositories.MatriculaRepository;

import jakarta.transaction.Transactional;

@Service
public class AlunoService {
    
    @Autowired
    AlunoRepository alunoRepository;

    @Autowired
    MatriculaRepository matriculaRepository;

    @Transactional
    public Aluno save(Aluno aluno){
        Matricula matriculaModel = new Matricula();
        matriculaModel.setDataDaMatricula(LocalDateTime.now(ZoneId.of("UTC")));
        Matricula matriculaSaved = matriculaRepository.save(matriculaModel);
        aluno.setMatricula(matriculaSaved);
        alunoRepository.save(aluno);
        return aluno;
    }

    @Transactional
    public List<Aluno> getAll(){
        List<Aluno> alunos = alunoRepository.findAll();
        return alunos;
    }

    @Transactional
    public void delete(UUID id){
        alunoRepository.deleteById(id);
    }

    @Transactional
    public Aluno update(Aluno aluno){
        Optional<Aluno> alunoExist = alunoRepository.findById(aluno.getId());
        if (alunoExist.isPresent()) {
            Aluno objeto = alunoExist.get();
            objeto.setCpf(aluno.getCpf());
            objeto.setBairro(aluno.getBairro());
            objeto.setDataDeNascimento(aluno.getDataDeNascimento());
            objeto.setAvaliacaoFisica(aluno.getAvaliacaoFisica());
            objeto.setMatricula(aluno.getMatricula());
            objeto.setNome(aluno.getNome());
            
            alunoRepository.save(objeto);
            return objeto;
        }
        throw new Error("Usuario Não Existe!");
    }
}
