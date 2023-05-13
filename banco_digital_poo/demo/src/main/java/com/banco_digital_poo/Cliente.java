package com.banco_digital_poo;

public class Cliente {
    private String nome;
    private Integer saldo;
    public Cliente(String nome){
        this.nome = nome;
        this.saldo = 0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSaldo() {
        return this.saldo;
    }


    public void sacar(Integer quantidade){
        if(quantidade > this.saldo){
            System.out.println("Saldo insuficiente");
        }else{
            this.saldo -= quantidade;
            System.out.println("Dinheiro Sacado");
        }
    }

}
