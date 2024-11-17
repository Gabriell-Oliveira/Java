package Prova2;

import java.util.Scanner;

public class Notebook {
	
	// Atributos privados
	private String Armazenamento;
    private String Processador;
    private int MemoriaRAM;
    private int opcao;
    private int upgrade;
    private double desconto;
    private double ValorTotal;
    private boolean fezUpgrade;
    
    // Construtor com parâmetros
    public Notebook(String Armazenamento, String Processador, int MemoriaRAM) {
    this.Armazenamento = Armazenamento;
    this.Processador = Processador;
    this.MemoriaRAM = MemoriaRAM;
    }
    
    // Métodos Getters e Setters
    public String getArmazenamento() {
    	return Armazenamento;
    }
    public void setArmazenamento(String Armazenamento) {
    	this.Armazenamento = Armazenamento;
    }
    public String getProcessador() {
    	return Processador;
    }
    public void setProcessador(String Processador) {
    	this.Processador = Processador;
    }
    public int getMemoriaRAM() {
    	return MemoriaRAM;
    }
    public void setMemoriaRAM(int MemoriaRAM) {
    	this.MemoriaRAM = MemoriaRAM;
    }
    
 
    // Construtor padrão sem parâmetros
    public Notebook() {
        this.opcao = 0;
        this.desconto = 0.0;
        this.upgrade = 0;
        this.ValorTotal = 0.0;
        this.fezUpgrade = false;
    }

    // Métodos Getters e Setters
    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public int getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(int upgrade) {
        this.upgrade = upgrade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }
    
    public boolean isFezUpgrade() {
    	return fezUpgrade;
    }

    // Método para calcular o upgrade da opção 1
    public void calcularUpgrade1() {
        Scanner dados = new Scanner(System.in);
        System.out.println("Você gostaria de fazer um upgrade por R$ 550 reais a mais? Onde melhoraria:\n"
                + "Memória RAM: 12GB para 16GB\n"
                + "Armazenamento: 512GB para 1TB\n"
                + "Processador Intel®: Intel® Core™ i5-1235U de 12ᵃ geração (3,30 GHz até 4,40 GHz) para Core™ i7-1215U de 12ª geração (3,30 GHz até 4,40 GHz)\n"
                + "Digite SIM ou NÃO");

        String opcao2 = dados.nextLine();

        // Comparação de strings para verificar a resposta e modificação dos construtures 
        if (opcao2.equalsIgnoreCase("SIM")) {
        	this.MemoriaRAM = 16;
            this.Armazenamento = "1TB";
            this.Processador = "Intel® Core™ i7-1215U de 12ª geração";
            this.ValorTotal = 2539.99 + 550;
            this.fezUpgrade = true;
        } else {
        	this.ValorTotal = 2539.99;
            this.fezUpgrade = false;
        }
    }

    // Método para calcular o upgrade da opção 2
    public void calcularUpgrade2() {
        Scanner dados = new Scanner(System.in);
        System.out.println("Você gostaria de fazer um upgrade por R$ 550 reais a mais? Onde melhoraria: \n"
        		+ "Memória RAM: 4GB para 8GB \n"
        		+ "Armazenamento: 128GB para 256GB\n"
        		+ "Processador Intel®: Celeron® N4500 (1,10 GHz até 2,80 GHz) para Core™ i3-1215U de 12ª geração (3,30 GHz até 4,40 GHz) \n"
        		+ "Digite SIM ou NÃO");
        
        String opcao2 = dados.nextLine();

     // Comparação de strings para verificar a resposta e modificação dos construtures 
        if (opcao2.equalsIgnoreCase("SIM")) {
        	this.MemoriaRAM = 8;
            this.Armazenamento = "256GB";
            this.Processador = "Intel® Core™ i3-1215U de 12ª geração";
            this.ValorTotal = 2023.99 + 550;
            this.fezUpgrade = true;
        } else {
        	this.ValorTotal = 2023.99;
            this.fezUpgrade = false;
        }
    }

    // Método para calcular o desconto ao comprar os dois notebooks
    public void calcularDesconto() {
        this.ValorTotal = (2023.99 + 2539.99) * 0.85; // Aplicação de 15% de desconto
        this.desconto = (2023.99 + 2539.99) - this.ValorTotal;
    }
    
    // Método para exibir as informações do aluno com toString
    public String toString() {
            return "Armazenamento: " + Armazenamento + "\n" +
                   "Processador: " + Processador + "\n" +
                   "Memória RAM: " + MemoriaRAM + "GB";
        
    }

 }
