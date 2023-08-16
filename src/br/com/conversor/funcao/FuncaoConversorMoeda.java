package br.com.conversor.funcao;

import java.util.Scanner;

public class FuncaoConversorMoeda {
    public static void menu() {
        System.out.println("------------------------------");
        System.out.println("Bem vindo ao Conversor de Moedas :)");
        System.out.println("1 - Real --> Dólar");
        System.out.println("2 - Real --> Euro");
        System.out.println("3 - Real --> Libra Esterlina");
        System.out.println("4 - Real --> Iene Japonês");
        System.out.println("5 - Real --> Won Sul-Coreano");
        System.out.println("6 - Dólar --> Real");
        System.out.println("7 - Euro --> Real");
        System.out.println("8 - Libra Esterlina --> Real");
        System.out.println("9 - sair.");
        System.out.println("------------------------------");
    }

    public static void converte(String origem, String destino, double cotacao, Scanner leitor) {
        System.out.println("Ok, você escolheu: " + origem + " --> " + destino);
        System.out.println("Digite o valor a ser convertido: ");
        double valor = leitor.nextDouble();
        double valorFinal = valor * cotacao;
        System.out.println("Valor final = " + valorFinal);
    }
}

