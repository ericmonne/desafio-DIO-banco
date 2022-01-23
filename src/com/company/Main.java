package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cliente josualda = new Cliente();
        josualda.setNome("Josualda");

        ContaCorrente cJosualda = new ContaCorrente(josualda);
        Conta pJosualda = new ContaPoupanca(josualda);
        cJosualda.depositar(100);
        cJosualda.transferir(pJosualda,60);
        cJosualda.imprimirExtrato();
        pJosualda.imprimirExtrato();
        Cliente valesco = new Cliente();
        valesco.setNome("Valesco");
        ContaCorrente cValesco = new ContaCorrente(valesco);
        cJosualda.transferir(cValesco, 10);
        cJosualda.imprimirExtrato();
        cValesco.imprimirExtrato();

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(valesco);
        clientes.add(josualda);
        System.out.println(clientes);
        Banco banco = new Banco();

    }
}
