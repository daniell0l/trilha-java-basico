package com.contabanco.service;

import com.contabanco.domain.model.Conta;

public class ContaService {

    public Conta criarConta(int numero, String agencia, String nomeCliente, double saldo) {
        return new Conta(numero, agencia, nomeCliente, saldo);
    }

    public String gerarMensagemBoasVindas(Conta conta) {
        return "Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.";
    }

    public boolean validarAgencia(String agencia) {
        return !agencia.matches("\\d{3}-\\d");
    }

    public boolean validarNumeroConta(int numero) {
        return !String.valueOf(numero).matches("\\d{4}");
    }

    public boolean validarNomeCliente(String nomeCliente) {
        String[] nomePartes = nomeCliente.trim().split("\\s+");
        return nomePartes.length >= 2;
    }
}
