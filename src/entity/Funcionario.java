package entity;
//quando estao dentro do mesmo package 
//nao precisa importar

public class Funcionario extends Pessoa {
  //super sempre no construtor
  //ele inicializa as propriedade do classe herdada
 //elas precisam ter o mesmo nome das propriedades da classe herdada
	public Funcionario(String nome,String cpf,String rg, String uf) {
		super(nome, cpf, rg,  uf);
	} 
}
