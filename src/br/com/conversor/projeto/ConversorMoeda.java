package br.com.conversor.projeto;

import br.com.conversor.funcao.FuncaoConversorMoeda;
import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner inicio = new Scanner(System.in);
        int input = 0;

        while (input !=9) {
            FuncaoConversorMoeda.menu();
            input = inicio.nextInt();

            switch (input) {
                case 1 -> FuncaoConversorMoeda.converte("Real", "Dólar", 0.20, inicio);
                case 2 -> FuncaoConversorMoeda.converte("Real", "Euro", 0.18, inicio);
                case 3 -> FuncaoConversorMoeda.converte("Real", "Libra Esterlina", 0.16, inicio);
                case 4 -> FuncaoConversorMoeda.converte("Real", "Iene Japonês", 29.20, inicio);
                case 5 -> FuncaoConversorMoeda.converte("Real", "Won Sul-Coreano", 268.11, inicio);
                case 6 -> FuncaoConversorMoeda.converte("Dólar", "Real", 4.99, inicio);
                case 7 -> FuncaoConversorMoeda.converte("Euro", "Real", 5.44, inicio);
                case 8 -> FuncaoConversorMoeda.converte("Libra Esterlina", "Real", 6.33, inicio);
                case 9 -> System.out.println("Que pena! Saindo do programa...");
                default -> System.out.println("Digite uma opção válida!");
            }
        }
    inicio.close();
    }
}
