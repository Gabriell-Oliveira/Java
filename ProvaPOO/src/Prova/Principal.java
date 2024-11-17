package Prova;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner dados = new Scanner(System.in);

	        // Criando o primeiro objeto Aluno
	        Aluno aluno1 = new Aluno();
	        System.out.println("Insira o nome do primeiro aluno: ");
	        aluno1.setNome(dados.next());
	        
	        System.out.println("Insira a matrícula do primeiro aluno: ");
	        aluno1.setMatricula(dados.next());
	        
	        System.out.println("Insira a primeira nota do primeiro aluno: ");
	        double nota1Aluno1 = dados.nextDouble();
	        
	        System.out.println("Insira a segunda nota do primeiro aluno: ");
	        double nota2Aluno1 = dados.nextDouble();
	        aluno1.setNotas(nota1Aluno1, nota2Aluno1);

	        // Criando o segundo objeto Aluno
	        Aluno aluno2 = new Aluno();
	        System.out.println("\nInsira o nome do segundo aluno: ");
	        aluno2.setNome(dados.next());
	        
	        System.out.println("Insira a matrícula do segundo aluno: ");
	        aluno2.setMatricula(dados.next());
	        
	        System.out.println("Insira a primeira nota do segundo aluno: ");
	        double nota1Aluno2 = dados.nextDouble();
	        
	        System.out.println("Insira a segunda nota do segundo aluno: ");
	        double nota2Aluno2 = dados.nextDouble();
	        aluno2.setNotas(nota1Aluno2, nota2Aluno2);

	        // Exibindo informações dos dois alunos com toString
	        System.out.println("\nInformações dos Alunos:");
	        System.out.println(aluno1.toString());
	        System.out.println(aluno1.validarMatricula());
	        System.out.println(aluno2.toString());
	        System.out.println(aluno2.validarMatricula());

	    }
	}
