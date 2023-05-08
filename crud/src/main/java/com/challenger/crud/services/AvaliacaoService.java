package com.challenger.crud.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenger.crud.models.Aluno;
import com.challenger.crud.models.AvaliacaoFisica;
import com.challenger.crud.repositories.AlunoRepository;
import com.challenger.crud.repositories.AvaliacaoFisicaRepository;

import jakarta.transaction.Transactional;

@Service
public class AvaliacaoService {
    @Autowired
    AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    AlunoRepository alunoRepository;

    @Transactional
    public AvaliacaoFisica save(AvaliacaoFisica avaliacaoFisica, UUID id){
        Optional<Aluno> aluno = alunoRepository.findById(id);
        if(aluno.isPresent()){
            Aluno alunoModel = aluno.get();
            alunoModel.setAvaliacaoFisica(avaliacaoFisicaRepository.save(avaliacaoFisica));
        }
        return avaliacaoFisica;
    }

    @Transactional
    public List<AvaliacaoFisica> getAll(){
        List<AvaliacaoFisica> avaliacaoFisicas = avaliacaoFisicaRepository.findAll();
        return avaliacaoFisicas;
    }

    @Transactional
    public AvaliacaoFisica update(AvaliacaoFisica avaliacaoFisica){
        Optional<AvaliacaoFisica> avaliacaoFisicaExist = avaliacaoFisicaRepository.findById(avaliacaoFisica.getId());
        if (avaliacaoFisicaExist.isPresent()) {
            AvaliacaoFisica objeto = avaliacaoFisicaExist.get();
            objeto.setAltura(avaliacaoFisica.getAltura());
            objeto.setPeso(avaliacaoFisica.getPeso());
            objeto.setDataDaAvaliacao(avaliacaoFisica.getDataDaAvaliacao());
            objeto.setAluno(avaliacaoFisica.getAluno());
            
            avaliacaoFisicaRepository.save(objeto);
            return objeto;
        }
        throw new Error("Avaliacao Fisica Não Existe!");
    }
}
