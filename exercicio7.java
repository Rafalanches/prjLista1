package pacote_exercicio7;

import java.util.Scanner;

public class exercicio7 {
	
public static void main(String[] args) {
		
	int n1, n2, n3;
	
	Scanner entrada = new Scanner(System.in);

	n1=(1200*10)/100;
	System.out.println("Quantas vendas você fez ao mês meu nobre? ");
	n2 = entrada.nextInt();
	n3=n1*n2;
	if(n3+1200>2000){
	System.out.println("Você conseguiu a comissão meu rei!!");
	}else { 
		System.out.println("Não foi dessa vez meu nobre");
		}

	}
}
