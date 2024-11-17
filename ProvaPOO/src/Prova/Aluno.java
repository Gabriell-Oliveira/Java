package Prova;

public class Aluno {

	// Atributos privados
    private String nome;
    private String matricula;
    private double nota1, nota2;
    private double media;

    // Construtor padrão sem parâmetros
    public Aluno() {
        this.nome = "";
        this.matricula = "";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.media = 0.0;
    }
    
    // Construtor com parâmetros
    public Aluno(String nome, String matricula, double nota1, double nota2, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double getNota1() {
    	return nota1;
    }
    
    public void setNota1(double nota1) {
    	this.nota1 = nota1;
    }
    
    public double getNota2() {
    	return nota2;
    }
    
    public void setNota(double nota2) {
    	this.nota2 = nota2;
    }

    // Método para calcular a média de notas
    public double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }
    
    // Método para definir as notas e calcular a média
    public void setNotas(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = calcularMedia(nota1, nota2);
    }

    // Método para validar a matrícula com matrículas predefinidas
    public String validarMatricula() {
    	
        // Lista de matrículas válidas predefinidas, utilizando array
        String[] matriculasValidas = {"123456", "456789"};

        // Verifica se a matrícula está na lista de matrículas válidas
        for (String matriculaValida : matriculasValidas) {
            if (matricula.equals(matriculaValida)) {
                return "Matrícula válida.";
            }
        }
        return "Matrícula inválida.";
    }

    // Método para exibir as informações do aluno com toString
        public String toString() {
        return "Aluno{" + "Seu Nome é ='" + nome + '\'' + ", Sua Matrícula é ='" + matricula +
                '\'' + ", Sua Média é =" + media + '}';
    }

}