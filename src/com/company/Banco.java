package com.company;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void listarClientes(List <Cliente> clientes){
        for(Cliente cliente : this.clientes){
            System.out.println(cliente.getNome());
        }
    }
}
