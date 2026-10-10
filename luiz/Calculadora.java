import java.util.Scanner;
	public class Calculadora {
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("digite um numero");
		double num1 = scanner.nextDouble();

		System.out.println("digite mais um numero");
		double num2 = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("digite uma operacao");
		String operacao = scanner.nextLine();
		
		double resultado = 0;
	
	if( operacao.equals("/") )
{
	resultado = num1 / num2;
}
	else if ( operacao.equals("*"))
{
	resultado = num1 * num2;
}
	else if (operacao.equals("+"))
{	
	resultado = num1 + num2;
}
	else if (operacao.equals("-")) 
{
	resultado = num1 - num2;
}
	else
{
	System.out.println("Digite uma operacao valida");
}
	
	System.out.println(" o reultado do valor e " + resultado);

}
}		
	
	
		
		
	 	