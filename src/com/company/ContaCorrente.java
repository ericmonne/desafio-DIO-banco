package com.company;

public class ContaCorrente extends Conta{


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Corrente ***");
        super.imprimirInfosComuns();
    }

    public void transferir(ContaCorrente contaDestino, double valor){
        double taxa = 0.01;
        double valorTaxado = valor + valor * taxa;
        this.sacar(valorTaxado);
        contaDestino.depositar(valor);
    }

}
