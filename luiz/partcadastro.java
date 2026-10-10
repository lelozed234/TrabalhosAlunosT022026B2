package fag;
import java.util.Scanner;

import fag.cadastro;
public class partcadastro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		cadastro c1 = new cadastro("luiz",21,"cascavel");
		cadastro c2= new cadastro("luiza",24,"cascavel");
		
		c1.apresentar();
		c2.apresentar();
		
		c2.fazeraniversario();
		
		c2.apresentar();
		
		c2.exibirdados();
		
		
	}

}
