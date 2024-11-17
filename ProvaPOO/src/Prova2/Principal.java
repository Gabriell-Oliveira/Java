package Prova2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        // Criação dos objetos Notebook
        Notebook notebook1 = new Notebook("512", "Intel® Core™ i5-1235U de 12ᵃ geração", 12);
    	Notebook notebook2 = new Notebook("128", "Intel Celeron® N4500", 4);

        System.out.println("Hoje em nossa loja estamos vendendo dois notebooks da marca LENOVO, \n"
        		+ "\n"
        		+ "Expecificações do Notebook 1  \n" + notebook1.toString() + "\n"
        		+ "\n"
        		+ "Expecificações do Notebook 2  \n" + notebook2.toString() + "\n"
        		+ "\n"
        		+ "Você pode escolher uma das opções de compra abaixo:\n"
                + "Opção 1: O notebook 1 IdeaPad 1i 14\" Intel que está saindo por R$ 2.539,99\n"
                + "Opção 2: O notebook 2 IdeaPad 1i 15\" Intel que está saindo por R$ 2.023,99\n"
                + "Opção 3: Comprar os dois juntos e receber 15% de desconto ao final da compra!");
        System.out.println("Qual opção você escolhe? 1, 2 ou 3?");
        int opcao = dados.nextInt();

        // Escolha da opção do usuário
        String resumoFinal = "";
        if (opcao == 1) {
        	notebook1.calcularUpgrade1();
            resumoFinal = "Opção escolhida: Notebook 1\n" +
                          "Upgrade realizado: " + (notebook1.isFezUpgrade() ? "Sim" : "Não") + "\n" +
                          "Especificações finais do Notebook 1:\n" + notebook1.toString() + "\n" +
                          "Valor a pagar: R$ " + notebook1.getValorTotal();
            
        } else if (opcao == 2) {
        	notebook2.calcularUpgrade2();
        	resumoFinal = "Opção escolhida: Notebook 2\n" +
        	              "Upgrade realizado: " + (notebook2.isFezUpgrade() ? "Sim" : "Não") + "\n" +
        	              "Especificações finais do Notebook 2:\n" + notebook2.toString() + "\n" +
        	              "Valor a pagar: R$ " + notebook2.getValorTotal();
        } else if (opcao == 3) {
        	notebook1.calcularDesconto();
            resumoFinal = "Opção escolhida: Ambos os Notebooks\n" +
                          "Desconto aplicado: 15%\n" +
                          "Valor a pagar: R$ " + notebook1.getValorTotal();
        } else {
            resumoFinal = "Opção inválida!";
        }
        
     // Exibe o resumo final
        System.out.println("\n=== NOTA FISCAL ===");
        System.out.println(resumoFinal);

    }
}