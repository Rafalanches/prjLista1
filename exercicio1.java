package pacote_exercicio1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, soma1, div1;
		
		 Scanner entrada = new Scanner(System.in);

		System.out.println("digite um numero");    
	     num1 = entrada.nextDouble();
	     System.out.println("digite um numero");    
	     num2 = entrada.nextDouble();

		
		soma1 = num1 + num2;
		div1 = soma1 / 2;
		if(div1>=7) {
		 System.out.println("Parabéns meu nobre você passou!!");
		}else{
			System.out.println("Não foi dessa vez meu nobre!");
			}
	
	}

}
