package Prova3;

import java.util.Scanner;

public class Medico {

	// Atributos privados
	private String Nome;
	private int Idade;
	private String Especialidade;
	private String CRM;
	private String Senha;
	private String Resposta;
	
	// Construtor padrão sem parâmetros
	public Medico () {
		this.Nome = "";
		this.Idade = 0;
		this.Especialidade = "";
		this.CRM = "";
		this.Senha = "";
		this.Resposta = "";
	}
	
	// Construtor com parâmetros
	public Medico (String Nome, int Idade, String Especialidade, String CRM, String Senha) {
		this.Nome = Nome;
		this.Idade = Idade;
		this.Especialidade = Especialidade;
		this.CRM = CRM;
		this.Senha = Senha;
		
	}
	
	// Métodos Getters e Setters
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public int getIdade() {
		return Idade;
	}
	
	public void setIdade(int Idade) {
		this.Idade = Idade;
	}
	
	public String getEspecialidade() {
		return Especialidade;
	}
	
	public void setEspecialidade(String Especialidade) {
		this.Especialidade = Especialidade;
	}
	
	public String getCRM() {
		return CRM;
	}
	
	public void setCRM(String CRM) {
		this.CRM = CRM;
	}
	
	public String getSenha() {
		return Senha;
	}
	
	public void setSenha(String Senha) {
		this.Senha = Senha;
	}
	
	
	// Método para verificar CRM e senha e exibir informações do médico
	public String VerificarCredenciais(String CRMentrada, String SenhaEntrada) {
		if (this.CRM.equals(CRMentrada) && this.Senha.equals(SenhaEntrada)) {
			return String.format("Nome: " + Nome + ", Idade: " + Idade + ", Especialidade: " + Especialidade + ".");
			
		}else {
			return "CRM ou senha inválida.";
			}
		}


		// Método para mudar a especialidade
	    public boolean MudarEspecialidade() {
	        Scanner dados = new Scanner(System.in);
	        System.out.println("Você gostaria de fazer alguma modificação na sua especialidade ? \n"
	        		+ "Digite SIM ou NÃO");
	        String Resposta = dados.nextLine();
	        
	        if (Resposta.equalsIgnoreCase("SIM")) {
	        	System.out.println("Digite sua nova especialidade: ");
		        String NovaEspecialidade = dados.nextLine();
	        	this.Especialidade = NovaEspecialidade;
	            return true;
	            
	        } else {
	        	return false;
	        }
	    }
	
	 // Método para exibir as informações do aluno com toString
	public String toString() {
		return "Medico " + Nome + '\n' +
                "Idade = " + Idade + " anos \n" +
                "Especialidade = " + Especialidade + '\n' +
                "CRM = " + CRM + '.'; 
	}

}
