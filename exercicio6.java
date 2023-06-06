package pacote_exercicio6;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {

	int n1;
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("escreva um numero meu nobre:");
	n1 = entrada.nextInt();
		if(n1%2==0){
	System.out.println("seu número é par");
		}else{
	System.out.println("seu número é ímpar");
		}
	}
}