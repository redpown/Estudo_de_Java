package entity;

public class Pessoa {
	public String nome; 
	public String rg; 
	public String cpf; 
	public String uf; 
	
	public Pessoa(String nome,String cpf,String rg, String uf) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.uf = uf;
	}
	
	public void imprimirNome() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("RG: " + rg);
		System.out.println("UF: " + uf);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
