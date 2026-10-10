package fag;

public class cadastro {
	public String nome;
	public int idade;
	public String cidade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void apresentar() 
	{
		System.out.println("o meu nome e "+this.nome+" tenho "+this.idade+" e moro em "+this.cidade);
	}
	
	public void fazeraniversario() 
	{
		this.idade=this.idade+1;
	}
	
	public void exibirdados() 
	{
		System.out.println("nome: "+this.nome);
		System.out.println("idade :"+this.idade);
		System.out.println("cidade: "+this.cidade);
	}
	
	public cadastro(String n, int i, String c)
	{
		setIdade(i);
		setNome(n);
		setCidade(c);
	}
	
		
		
	

}
