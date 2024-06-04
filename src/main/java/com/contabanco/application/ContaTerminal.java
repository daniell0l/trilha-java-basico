package com.contabanco.application;

import com.contabanco.domain.model.Conta;
import com.contabanco.service.ContaService;
import com.contabanco.infrastructure.ConsoleInput;

public class ContaTerminal {

    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        ContaService contaService = new ContaService();

        int numero;
        do {
            numero = input.lerInt("Por favor, digite o número da Conta (4 dígitos): ");
            if (contaService.validarNumeroConta(numero)) {
                System.out.println("Por favor, digite uma conta válida.");
            }
        } while (contaService.validarNumeroConta(numero));

        String agencia;
        do {
            agencia = input.lerString("Por favor, digite o número da Agência (formato XXX-X): ");
            if (contaService.validarAgencia(agencia)) {
                System.out.println("Agência inválida, por favor digite uma agência válida.");
            }
        } while (contaService.validarAgencia(agencia));

        String nomeCliente;
        do {
            nomeCliente = input.lerString("Por favor, digite o nome completo do Cliente: ");
            if (contaService.validarNomeCliente(nomeCliente)) {
                System.out.println("Por favor, digite o nome completo.");
            }
        } while (contaService.validarNomeCliente(nomeCliente));

        double saldo = input.lerDouble("Por favor, digite o saldo inicial: ");

        Conta conta = contaService.criarConta(numero, agencia, nomeCliente, saldo);
        String mensagem = contaService.gerarMensagemBoasVindas(conta);

        System.out.println(mensagem);
    }
}
