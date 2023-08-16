package br.com.conversor.funcao;

import javax.swing.*;

import static javax.swing.JOptionPane.*;


public class FuncaoGrafica extends JFrame {
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem opcao1;
    private JMenuItem opcao2;
    private JMenuItem opcao3;
    private JMenuItem opcao4;
    private JMenuItem opcao5;
    private JMenuItem opcao6;
    private JMenuItem opcao7;
    private JMenuItem opcao8;
    private JMenuItem opcao9;
    private double valor;
    private double realDolar = 0.20;
    private double realEuro = 0.18;
    private double realLibra = 0.16;
    private double realIene = 29.33;
    private double realWon = 269.85;
    private double dolar = 4.97;
    private double euro = 5.42;
    private double libra = 6.33;


        public FuncaoGrafica() {
            setTitle("Conversor de Moedas");
            setSize(500,400);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            JPanel painel = new JPanel();
            menu();
            painel.add(menuBar);
            add(painel);
        }

    public void menu() {
        menuBar = new JMenuBar();
        menu = new JMenu("Escolha uma opção: ");
        opcao1 = new JMenuItem("Converter Real para Dólar");
        opcao2 = new JMenuItem("Converter Real para Euro");
        opcao3 = new JMenuItem("Converter Real para Libra Esterlina");
        opcao4 = new JMenuItem("Converter Real para Iene Japonês");
        opcao5 = new JMenuItem("Converter Real para Won Sul-Coreano");
        opcao6 = new JMenuItem("Converter Dólar para Real");
        opcao7 = new JMenuItem("Converter Euro para Real");
        opcao8 = new JMenuItem("Converter Libra Esterlina para Real");
        opcao9 = new JMenuItem("Sair");

        menu.add(opcao1);
        menu.add(opcao2);
        menu.add(opcao3);
        menu.add(opcao4);
        menu.add(opcao5);
        menu.add(opcao6);
        menu.add(opcao7);
        menu.add(opcao8);
        menu.add(opcao9);

        menuBar.add(menu);

        opcao1.addActionListener(e -> {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));
            double converte = valor * realDolar;
            JOptionPane.showMessageDialog(null,"O valor da conversão é de US$ " + converte );
            int continuar = Integer.parseInt(String.valueOf(JOptionPane.showConfirmDialog(null,"Deseja continuar ?", "Pergunta ao Usuário",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE )));
            if (continuar == NO_OPTION) {
                System.exit(0);
            }
            if (continuar == YES_OPTION) {
                return;
            } else {
                if (continuar == CANCEL_OPTION) {
                    System.exit(0);
                }
            }
        });

        opcao2.addActionListener(e -> {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));
            double converte = valor * realEuro;
            JOptionPane.showMessageDialog(null,"O valor da conversão é de US$ " + converte );
            int continuar = Integer.parseInt(String.valueOf(JOptionPane.showConfirmDialog(null,"Deseja continuar ?", "Pergunta ao Usuário",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE )));
            if (continuar == NO_OPTION) {
                System.exit(0);
            }
            if (continuar == YES_OPTION) {
                return;
            } else {
                if (continuar == CANCEL_OPTION) {
                    System.exit(0);
                }
            }
        });

        opcao3.addActionListener(e -> {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));
            double converte = valor * realLibra;
            JOptionPane.showMessageDialog(null,"O valor da conversão é de US$ " + converte );
            int continuar = Integer.parseInt(String.valueOf(JOptionPane.showConfirmDialog(null,"Deseja continuar ?", "Pergunta ao Usuário",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE )));
            if (continuar == NO_OPTION) {
                System.exit(0);
            }
            if (continuar == YES_OPTION) {
                return;
            } else {
                if (continuar == CANCEL_OPTION) {
                    System.exit(0);
                }
            }
        });

        opcao4.addActionListener(e -> {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));
            double converte = valor * realIene;
            JOptionPane.showMessageDialog(null,"O valor da conversão é de US$ " + converte );
            int continuar = Integer.parseInt(String.valueOf(JOptionPane.showConfirmDialog(null,"Deseja continuar ?", "Pergunta ao Usuário",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE )));
            if (continuar == NO_OPTION) {
                System.exit(0);
            }
            if (continuar == YES_OPTION) {
                return;
            } else {
                if (continuar == CANCEL_OPTION) {
                    System.exit(0);
                }
            }
        });

        opcao5.addActionListener(e -> {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));
            double converte = valor * realWon;
            JOptionPane.showMessageDialog(null,"O valor da conversão é de US$ " + converte );
            int continuar = Integer.parseInt(String.valueOf(JOptionPane.showConfirmDialog(null,"Deseja continuar ?", "Pergunta ao Usuário",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE )));
            if (continuar == NO_OPTION) {
                System.exit(0);
            }
            if (continuar == YES_OPTION) {
                return;
            } else {
                if (continuar == CANCEL_OPTION) {
                    System.exit(0);
                }
            }
        });

        opcao6.addActionListener(e -> {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));
            double converte = valor * dolar;
            JOptionPane.showMessageDialog(null,"O valor da conversão é de US$ " + converte );
            int continuar = Integer.parseInt(String.valueOf(JOptionPane.showConfirmDialog(null,"Deseja continuar ?", "Pergunta ao Usuário",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE )));
            if (continuar == NO_OPTION) {
                System.exit(0);
            }
            if (continuar == YES_OPTION) {
                return;
            } else {
                if (continuar == CANCEL_OPTION) {
                    System.exit(0);
                }
            }
        });

        opcao7.addActionListener(e -> {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));
            double converte = valor * euro;
            JOptionPane.showMessageDialog(null,"O valor da conversão é de US$ " + converte );
            int continuar = Integer.parseInt(String.valueOf(JOptionPane.showConfirmDialog(null,"Deseja continuar ?", "Pergunta ao Usuário",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE )));
            if (continuar == NO_OPTION) {
                System.exit(0);
            }
            if (continuar == YES_OPTION) {
                return;
            } else {
                if (continuar == CANCEL_OPTION) {
                    System.exit(0);
                }
            }
        });

        opcao8.addActionListener(e -> {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));
            double converte = valor * libra;
            JOptionPane.showMessageDialog(null,"O valor da conversão é de US$ " + converte );
            int continuar = Integer.parseInt(String.valueOf(JOptionPane.showConfirmDialog(null,"Deseja continuar ?", "Pergunta ao Usuário",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE )));
            if (continuar == NO_OPTION) {
                System.exit(0);
            }
            if (continuar == YES_OPTION) {
                return;
            } else {
                if (continuar == CANCEL_OPTION) {
                    System.exit(0);
                }
            }
        });

        opcao9.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,"Programa Finalizado !");
            System.exit(0);
        });
    }


    public static void main(String[] args) {
            FuncaoGrafica janela = new FuncaoGrafica();
            janela.setVisible(true);
    }
}
