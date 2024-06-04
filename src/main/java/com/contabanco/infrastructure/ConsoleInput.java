package com.contabanco.infrastructure;

import java.util.Scanner;

public class ConsoleInput {

    private Scanner scanner;

    public ConsoleInput() {
        this.scanner = new Scanner(System.in);
    }

    public int lerInt(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            System.out.print(mensagem);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.next();
    }

    public double lerDouble(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            System.out.print(mensagem);
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
