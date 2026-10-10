package fag;

public class carro {
	
	public String modelo;
	private String marca;
	private int ano;
	
	
	
	public void status() 
	{
		System.out.println("modelo: "+this.modelo);
		System.out.println("marca: "+this.marca);
		System.out.println("cor: "+this.ano);
	
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	
	
	public carro(String modelo, String marca , int ano){
		setModelo(modelo);
		setMarca(marca);
		setAno(ano);
	}

}
