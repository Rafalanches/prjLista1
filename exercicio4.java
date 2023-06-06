package pacote_exercicio4;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int n1, n2;
		System.out.println("Quanto tempo de empresa meu rei? ");
	    n1 = entrada.nextInt();
		System.out.println("Qual o seu salario meu nobre? ");
	    n2 = entrada.nextInt();
		if(n1>5) {	
			System.out.println("Seu salário é de "+ n2+(n2*20)/100 +" meu nobre");
		}else{ 
			System.out.println("Seu salário é de "+ n2+(n2*10)/100 +" meu nobre");
			}
	
	}

}
