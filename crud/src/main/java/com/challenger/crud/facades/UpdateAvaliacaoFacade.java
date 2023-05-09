package com.challenger.crud.facades;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.challenger.crud.models.AvaliacaoFisica;

@Component
public class UpdateAvaliacaoFacade {
    public AvaliacaoFisica updateAvaliacaoFacade(Optional<AvaliacaoFisica> avaliacaoFisicaExist, AvaliacaoFisica avaliacaoFisicaUpdate){
        AvaliacaoFisica avaliacaoFisica = avaliacaoFisicaExist.get();
        avaliacaoFisica.setAltura(avaliacaoFisicaUpdate.getAltura());
        avaliacaoFisica.setPeso(avaliacaoFisicaUpdate.getPeso());
        avaliacaoFisica.setDataDaAvaliacao(avaliacaoFisicaUpdate.getDataDaAvaliacao());
        avaliacaoFisica.setAluno(avaliacaoFisicaUpdate.getAluno());

        return avaliacaoFisica;
    }
}
