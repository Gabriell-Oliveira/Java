//1.	Cadastro de Livros:
//●	Permitir o cadastro de novos livros no sistema, 
//	incluindo informações como título, 
//	autor, 
//	editora, 
//	ano de publicação, 
//	ISBN, e 
//	quantidade disponível.


package Prova_APS;

public class Livro {
	
	private String Titulo;
	private String Autor;
	private String Editora;
	private int AnoDePublicacao;
	private String ISBN;
	private int QuantidadeDisponivel;
	
	public Livro(String Titulo, String Autor, String Editora, int AnoDePublicacao, String ISBN, int QuantidadeDisponivel) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Editora = Editora;
        this.AnoDePublicacao = AnoDePublicacao;
        this.ISBN = ISBN;
        this.QuantidadeDisponivel = QuantidadeDisponivel;
    }
	
	public String getTitulo() {
		return Titulo;
	}
	
	public void setTitulo(String Titulo) {
		this.Titulo = Titulo;
	}
	
	public String getAutor() {
		return Autor;
	}
	
	public void setAutor(String Autor) {
		this.Autor = Autor;
	}
	
	public String getEditora() {
		return Editora;
	}
	
	public void setEditora(String Editora) {
		this.Editora = Editora;
	}
	
	public int getAnoDePublicacao() {
		return AnoDePublicacao;
	}
	
	public void setAnoDePublicacao(int AnoDePublicacao) {
		this.AnoDePublicacao = AnoDePublicacao;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public int getQuantidadeDisponivel() {
		return QuantidadeDisponivel;
	}
	
	public void setQuantidadeDisponivel(int QuantidadeDisponivel) {
		this.QuantidadeDisponivel = QuantidadeDisponivel;
	}

	public String toString() {
       return "Livro com o Titulo " + Titulo + ", \n"
       		+ "do Autor(a) " + Autor + ", \n"
       				+ "da Editora " + Editora + ", \n"
       						+ "Publicado no ano de " + AnoDePublicacao + ", \n"
       								+ "com o ISBN " + ISBN + ", \n"
       										+ "tem " + QuantidadeDisponivel + " Exemplares.";      
	}
    
}