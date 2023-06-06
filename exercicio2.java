package pacote_exercicio2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int age;
		
		 System.out.println("Qual a sua idade meu rei ");
		 age = entrada.nextInt();

	if(age>=18){
		System.out.println("Você é maior de idade meu nobre, ja pode dirigir, mas vai com calma!");
		}else{
			System.out.println("Você é menor de idade consagrado, ainda não é a hora.");
		}
	
	}

}
