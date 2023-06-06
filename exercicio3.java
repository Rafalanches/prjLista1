package pacote_exercicio3;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Digite um número");
		n1= entrada.nextInt();
		System.out.println("Digite um número");
		n2= entrada.nextInt();
		System.out.println("Digite um número");
		n3= entrada.nextInt();

		if(n1>=n2 & n1>=n3){ 
			 System.out.println("O maior número é o "+n1 +" meu nobre");
		}else if(n2>=n1 & n2>=n3){ 
			 System.out.println("O maior número é o "+n2 +" meu nobre");
		}else if(n3>=n1 & n3>=n2){
			 System.out.println("O maior número é o "+n3 +" meu nobre");	
			}
	
	}

}