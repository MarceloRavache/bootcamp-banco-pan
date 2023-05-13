package com.banco_digital_poo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;

    public Banco(){
        this.clientes = new ArrayList<Cliente>();
    }

    public Cliente getCliente(String nome){
        for(Cliente cliente : this.clientes){
            if(cliente.getNome().equals(nome)){
                return cliente;
            }
        }
        return new Cliente("Não Existe!");
    }
}
