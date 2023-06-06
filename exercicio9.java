package pacote_exercicio9;

import java.util.Scanner;

public class exercicio9 {
	
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int PAG;
	double HE, ME, HS, MS, tem;
	
	System.out.println("qual foi a hora que você entrou? ");
	HE = entrada.nextDouble();
	System.out.println("qual foi o minuto em que você entrou? ");
	ME = entrada.nextDouble();
	System.out.println("qual foi a hora que você saiu? ");
	HS = entrada.nextDouble();
	System.out.println("qual foi o minuto em que você saiu? ");
	MS = entrada.nextDouble();
	tem=(HE+ME)-(HS+MS);
		if(tem<=1) {
			System.out.println("O valor do estacionamento vai ser de R$4,00 meu nobre");
		}else if(tem<=2) {
			System.out.println("O valor do estacionamento vai ser de R$6,00 meu nobre");
		}else if(tem>2) {
			System.out.println("O valor do estacionamento é "+ (tem*1)+6 +"meu nobre");
		}
	}
}
