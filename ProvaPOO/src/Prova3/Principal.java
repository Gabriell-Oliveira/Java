package Prova3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
       Scanner dados = new Scanner(System.in);
    	
    	// Criando dois objetos Medico
        Medico medico1 = new Medico("Dr. Gerhard", 45, "Cardiologista", "123456", "MeDePapai");
        Medico medico2 = new Medico("Dra. Amanda", 38, "Neurologista", "456789", "Receba");

        System.out.println("Olá, para acessar as informações do Medico(a). \n");
        		
     // Solicitar CRM e Senha ao usuário
        System.out.println("Por favor digite a CRM:  ");
        String CRMentrada = dados.nextLine();
        
        System.out.println("Por favor digite a Senha: ");
        String SenhaEntrada = dados.nextLine();
        
     // Verificar credenciais e exibir informações para o primeiro médico
        String resultado1 = medico1.VerificarCredenciais(CRMentrada, SenhaEntrada);
        if (resultado1.startsWith("Nome")) {
            System.out.println("Informações do médico 1: " + resultado1);
            boolean alterado1 = medico1.MudarEspecialidade();
            if (alterado1) {
                System.out.println("Informações atualizadas do médico 1: \n" + medico1.toString());
            } else {
                System.out.println("Nenhuma alteração foi feita no médico 1. Informações originais: \n" + medico1.toString());
            }
        }

        // Verificar credenciais e exibir informações para o segundo médico
        String resultado2 = medico2.VerificarCredenciais(CRMentrada, SenhaEntrada);
        if (resultado2.startsWith("Nome")) {
            System.out.println("Informações do médico 2: " + resultado2);
            boolean alterado2 = medico2.MudarEspecialidade();
            if (alterado2) {
                System.out.println("Informações atualizadas do médico 2: \n" + medico2.toString());
            } else {
                System.out.println("Nenhuma alteração foi feita no médico 2. Informações originais: \n" + medico2.toString());
            }
        }
        
     // Se as credenciais não corresponderem a nenhum médico, exibir mensagem de erro
        if (!resultado1.startsWith("Nome") && !resultado2.startsWith("Nome")) {
            System.out.println("CRM ou senha inválida.");
        }

        
    }
}
