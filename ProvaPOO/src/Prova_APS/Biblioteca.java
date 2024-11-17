//A classe Biblioteca será responsável por gerenciar os livros cadastrados e 
//realizar operações como adicionar, 
//buscar, 
//atualizar e 
//excluir livros.

package Prova_APS;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Biblioteca {
	Scanner dados = new Scanner(System.in);

	private List<Livro> Acervo;
	private int[] data = new int[3]; // 0: dia, 1: mês, 2: ano
	
	public Biblioteca() {
		this.Acervo = new ArrayList<>();
		
	}
	
	// Construtor
    public Biblioteca(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            data[0] = dia;
            data[1] = mes;
            data[2] = ano;
        } else {
            System.out.println("Data inválida!");
        }
    }
        
     // Métodos getter e setter para os componentes da data
        public int getDia() {
            return data[0];
        }
 
        public void setDia(int dia) {
            if (validaData(dia, data[1], data[2])) {
                data[0] = dia;
            } else {
                System.out.println("Dia inválido!");
            }
        }
        
        public int getMes() {
            return data[1];
        }

        public void setMes(int mes) {
            if (validaData(data[0], mes, data[2])) {
                data[1] = mes;
            } else {
                System.out.println("Mês inválido!");
            }
        }
        
        public int getAno() {
            return data[2];
        }

        public void setAno(int ano) {
            if (validaData(data[0], data[1], ano)) {
                data[2] = ano;
            } else {
                System.out.println("Ano inválido!");
            }
        }
	
	public void Menu() {
        while (true) {
        	System.out.println("\n=== Bem vindo ao ===");
            System.out.println("=== Sistema da Biblioteca ===\n");
            System.out.println("Qual das funções abaixo você gostaria de usar: \n");
            System.out.println("1. Administração de livros");
            System.out.println("2. Buscar algum livro");
            System.out.println("3. Emprestimo de livro");
            System.out.println("4. Devolução de livros");
            System.out.println("5. Sair\n");
            System.out.print("Escolha uma opção digitando apenas o número: ");

            String Opcao = dados.nextLine();

            switch(Opcao) {
                case "1":
                	AdministracaoLivros();
                    break;
                case "2":
                	BuscarLivros();
                    break;
                case "3":
                	EmprestarLivro();
                    break;
                case "4":
                	DevolverLivro();
                    break;
                case "5":
                    System.out.println("Encerrando o sistema. Até mais 👍");
                    dados.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }
	
	public void AdministracaoLivros() {
		while (true) {
            System.out.println("\n=== Sistema de Administração de livros ===");
            System.out.println("1. Adcionar um livro");
            System.out.println("2. Atualizar um livro");
            System.out.println("3. Excluir um livro");
            System.out.println("4. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            String Opcao = dados.nextLine();

            switch(Opcao) {
                case "1":
                	AdcionarLivros();
                    break;
                case "2":
                	AtualizarLivro();
                    break;
                case "3":
                	ExcluirLivro();
                	break;
                case "4":
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }
	
	public void AdcionarLivros() {
		System.out.println("Cadastrar novo livros: ");
		while(true) {
			System.out.println("Digite o título do livro (ou digite 'sair' para finalizar): ");
			String Titulo = dados.nextLine();
			
			if (Titulo.equalsIgnoreCase("sair")) {
				break;
			}
			
			System.out.println("Digite o Autor(a) do livro: ");
			String Autor = dados.nextLine();
		
			System.out.println("Digite o editor(a) do livro: ");
			String Editora = dados.nextLine();
		
			System.out.println("Digite o ano da publicação do livro: ");
			int AnoDePublicacao = dados.nextInt();
			dados.nextLine(); // Consumir a quebra de linha
			
			System.out.println("Digite o ISBN do livro: ");
			String ISBN = dados.nextLine();
			
			System.out.println("Digite a quantidade de livros: ");
			int QuantidadeDisponivel = dados.nextInt();
			dados.nextLine();
			
			Livro livro = new Livro(Titulo, Autor, Editora, AnoDePublicacao, ISBN, QuantidadeDisponivel);
			Acervo.add(livro);
			System.out.println("Livro cadastrado com sucesso! \n");
		}
	}
		
	public void AtualizarLivro() {
		if (Acervo.isEmpty()) {
			System.out.println("Nenhum livro cadastrado para atualizar.");
			return;
		}
		
		System.out.println("Digite o título do livro a ser atualizado: ");
		String titulo = dados.nextLine();
		
		for (Livro livro : Acervo) {
			if (livro.getTitulo().equalsIgnoreCase(titulo)) {
				livro.toString();
				
				System.out.println("Digite o novo título (ou pressione Enter para manter o atual): ");
	            String NovoTitulo = dados.nextLine();
	            if (!NovoTitulo.isEmpty()) {
	            	livro.setTitulo(NovoTitulo);
	            }
	            
	            System.out.println("Digite o(a) novo(a) Autor(a) (ou pressione Enter para manter o atual): ");
	            String NovoAutor = dados.nextLine();
	            if (!NovoAutor.isEmpty()) {
	            	livro.setAutor(NovoAutor);
	            }
	            
	            System.out.println("Digite a nova Editora (ou pressione Enter para manter o atual): ");
	            String NovoEditora = dados.nextLine();
	            if (!NovoEditora.isEmpty()) {
	            	livro.setEditora(NovoEditora);
	            }
	            
	            System.out.println("Digite o novo ano de publicação (ou pressione Enter para manter o atual): ");
	            String NovoAnoStr = dados.nextLine();
	            if (!NovoAnoStr.isEmpty()) {
	                try {
	                    int NovoAno = Integer.parseInt(NovoAnoStr);
	                    livro.setAnoDePublicacao(NovoAno); // Correção: setAnoDePublicacao
	                } catch (NumberFormatException e) {
	                    System.out.println("Ano inválido. Mantendo o valor atual.");
	                }
	            }
	            
	            System.out.println("Digite o novo ISBN (ou pressione Enter para manter o atual): ");
	            String NovoISBN = dados.nextLine();
	            if (!NovoISBN.isEmpty()) {
	            	livro.setISBN(NovoISBN);
	            }
	            
	            System.out.println("Digite a nova quantidade de exemplares disponiveis (ou pressione Enter para manter o atual): ");
	            String NovaQuantidadeStr = dados.nextLine();
	            if (!NovaQuantidadeStr.isEmpty()) {
	                try {
	                    int NovaQuantidade = Integer.parseInt(NovaQuantidadeStr);
	                    livro.setQuantidadeDisponivel(NovaQuantidade);
	                } catch (NumberFormatException e) {
	                    System.out.println("Quantidade inválida. Mantendo o valor atual.");
	                }
	            }
	            
	            System.out.println("Livro atualizado com sucesso =)");
	            return;
			}
		}
		System.out.println("Livro não encontrado =(");
	}
	
	public void ExcluirLivro() {
		System.out.println("Digite o título do livro a ser excluido: ");
		String Titulo = dados.nextLine();
		
		Livro livroTchau = null;
		for (Livro livro : Acervo) {
			if (livro.getTitulo().equalsIgnoreCase(Titulo)) {
				livroTchau = livro;
				break;
			}
		}
		if (livroTchau != null) {
			Acervo.remove(livroTchau);
			System.out.println("Livro excluído.");
		} else {
			System.out.println("Livro não encontrado.");
		}
	}
	
	public void BuscarLivros() {
        while (true) {
            System.out.println("\n=== Sistema de Busca dos livros ===");
            System.out.println("1. Buscar por Titulo.");
            System.out.println("2. Buscar por Autor.");
            System.out.println("3. Buscar por ISBN");
            System.out.println("4. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            String Opcao = dados.nextLine();

            switch(Opcao) {
                case "1":
                	BuscarLivroPorTitulo();
                    break;
                case "2":
                	BuscarLivroPorAutor();
                    break;
                case "3":
                	BuscarLivroPorISBN();
                	break;
                case "4":
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }
	
	public void BuscarLivroPorTitulo() {
		if (Acervo.isEmpty()) {
			System.out.println("Nenhum livro cadastrado.");
			return;
		}
		System.out.println("Digite o título do livro: ");
		String Titulo = dados.nextLine();
		
		for (Livro livro : Acervo) {
			if (livro.getTitulo().equalsIgnoreCase(Titulo)) {
				System.out.println(livro.toString()); 
				return;
			}
		}
		System.out.println("Livro não encontrado.");
	}
	
	public void BuscarLivroPorAutor() {
		if (Acervo.isEmpty()) {
			System.out.println("Nenhum livro cadastrado.");
			return;
		}
		System.out.println("Digite o(a) autor(a) do livro: ");
		String Autor = dados.nextLine();
		
		for (Livro livro : Acervo) {
			if (livro.getAutor().equalsIgnoreCase(Autor)) {
				System.out.println(livro.toString());
				return;
			}
		}
		System.out.println("Livro não encontrado.");
	}
	
	public void BuscarLivroPorISBN() {
		if (Acervo.isEmpty()) {
			System.out.println("Nenhum livro cadastrado.");
			return;
		}
		System.out.println("Digite o ISBN do livro: ");
		String ISBN = dados.nextLine();
		
		for (Livro livro : Acervo) {
			if (livro.getISBN().equalsIgnoreCase(ISBN)) {
				System.out.println(livro.toString());
				return;
			}
		}
		System.out.println("Livro não encontrado.");
	}
	
	private boolean validaData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) return false;
 
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
 
    return dia > 0 && dia <= diasPorMes[mes - 1];
    }
    
 // Método para retornar a data formatada
    public String getDataFormatada() {
        return String.format("%02d/%02d/%04d", data[0], data[1], data[2]);
    }
	
	public void EmprestarLivro() {
		if (Acervo.isEmpty()) {
	        System.out.println("Nenhum livro cadastrado para empréstimo.");
	        return;
	    }
		
		System.out.println("Por favor Digite seu nome para poder pegar emprestado um livro");
		String Nome = dados.nextLine();
		
		System.out.println("Digite o título do livro que deseja pegar emprestado: ");
		String Titulo = dados.nextLine();
		
		System.out.println("Digite o dia (em número) que você está pegando emprestado o livro");
		data[0] = dados.nextInt();
		
		System.out.println("Digite o mês (em número) que você está pegando emprestado o livro");
		data[1] = dados.nextInt();
		
		System.out.println("Digite o ano (em número) que você está pegando emprestado o livro");
		data[2] = dados.nextInt();
		
		dados.nextLine();
		
		// Verifica se a data é válida
	    if (!validaData(data[0], data[1], data[2])) {
	        System.out.println("Data inválida.");
	        return;
	    }
	    
	    int[] dataDevolucao = calcularDataPrevisaoDevolucao(data[0], data[1], data[2], 15);
	    
	    for (Livro livro : Acervo) {
			if (livro.getTitulo().equalsIgnoreCase(Titulo)) {
				if (livro.getQuantidadeDisponivel() > 0) {
				livro.setQuantidadeDisponivel(livro.getQuantidadeDisponivel() - 1);
				System.out.println("Livro foi pego emprestado no dia "+ getDataFormatada() +" com sucesso =)");
				System.out.println("Você tem que devolve em 15 dias");
				System.out.println("Data prevista de devolução: " + String.format("%02d/%02d/%04d", dataDevolucao[0], dataDevolucao[1], dataDevolucao[2]));
			} else {
				System.out.println("Desculpe, não há exemplares disponíveis deste livro");
			}
			return;
			}
		}
		System.out.println("Livro não encontrado.");
	}
	
	// Método para calcular a data de devolução (sem considerar anos bissextos)
	private int[] calcularDataPrevisaoDevolucao(int dia, int mes, int ano, int diasAdicionais) {
	    int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	    dia += diasAdicionais;

	    // Ajustar a data se ultrapassar o número de dias no mês
	    while (dia > diasPorMes[mes - 1]) {
	        dia -= diasPorMes[mes - 1];
	        mes++;

	        // Ajustar o mês e o ano se ultrapassar dezembro
	        if (mes > 12) {
	            mes = 1;
	            ano++;
	        }
	    }

	    return new int[]{dia, mes, ano};
	}
	
	// Função auxiliar para calcular o número de dias desde o início do ano
	private int calcularDias(int dia, int mes, int ano) {
	    int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    int totalDias = dia;

	    for (int i = 0; i < mes - 1; i++) {
	        totalDias += diasPorMes[i];
	    }
	        
	     // Adicionar dias para os anos anteriores (sem considerar bissextos neste exemplo)
	        totalDias += (ano - 1) * 365;

	        return totalDias;
	    }
	
	public void DevolverLivro() {
		if (Acervo.isEmpty()) {
			System.out.println("Nenhum livro cadastrado para Devolução.");
			return;
		}
		
		System.out.println("Por favor Digite seu nome: ");
		String Nome = dados.nextLine();
		
		System.out.println("Digite o título do livro que deseja devolver: ");
		String Titulo = dados.nextLine();
		
		// Coletar data de empréstimo
	    System.out.println("Digite o dia em que você pegou o livro emprestado:");
	    int diaEmprestimo = dados.nextInt();
	    
	    System.out.println("Digite o mês em que você pegou o livro emprestado:");
	    int mesEmprestimo = dados.nextInt();
	    
	    System.out.println("Digite o ano em que você pegou o livro emprestado:");
	    int anoEmprestimo = dados.nextInt();

	    // Coletar data de devolução
	    System.out.println("Digite o dia em que você está devolvendo o livro:");
	    int diaDevolucao = dados.nextInt();
	    
	    System.out.println("Digite o mês em que você está devolvendo o livro:");
	    int mesDevolucao = dados.nextInt();
	    
	    System.out.println("Digite o ano em que você está devolvendo o livro:");
	    int anoDevolucao = dados.nextInt();

	    dados.nextLine(); // Limpar buffer do scanner
		
		for (Livro livro : Acervo) {
			
		if (livro.getTitulo().equalsIgnoreCase(Titulo)) {
			
			// Calcular a diferença em dias (simplificado, sem considerar anos bissextos)
		    int diasEmprestimo = calcularDias(diaEmprestimo, mesEmprestimo, anoEmprestimo);
		    int diasDevolucao = calcularDias(diaDevolucao, mesDevolucao, anoDevolucao);
		    int diasAtraso = diasDevolucao - diasEmprestimo;

		    // Verificar se há atraso (mais de 15 dias)
				
				livro.setQuantidadeDisponivel(livro.getQuantidadeDisponivel() + 1);
				if (diasAtraso > 15) {
			        System.out.println("Livro devolvido, mas com atraso de " + (diasAtraso - 15) + " dias. Multa de R$ 5,00.");
			    } else {
			        System.out.println("Livro devolvido no prazo.");
			    }
				return;
			} 
			}
	    
		System.out.println("Livro não encontrado");
		}
		
	}
