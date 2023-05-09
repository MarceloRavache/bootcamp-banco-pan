package com.challenger.crud.facades;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.challenger.crud.models.Aluno;

@Component
public class UpdateAlunoFacade {
    public Aluno updateAlunoFacade(Optional<Aluno> alunoExist, Aluno alunoUpdate){
        Aluno aluno = alunoExist.get();
        aluno.setCpf(alunoUpdate.getCpf());
        aluno.setBairro(alunoUpdate.getBairro());
        aluno.setDataDeNascimento(alunoUpdate.getDataDeNascimento());
        aluno.setAvaliacaoFisica(alunoUpdate.getAvaliacaoFisica());
        aluno.setMatricula(alunoUpdate.getMatricula());
        aluno.setNome(alunoUpdate.getNome());

        return aluno;
        
    }
}
