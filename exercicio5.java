package pacote_exercicio5;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n1, n2, n3;
		 System.out.println("Qual o valor do empréstmo? ");
		 n1 = entrada.nextInt();
		 System.out.println("E qual o valor das parcelas? ");
		 n2 = entrada.nextInt();
		 System.out.println("E o teu salário meu bom? ");
		 n3 = entrada.nextInt();
		 
			if(n2<360) { 
				System.out.println("Empréstimo aprovado consagrado!!");
			}else{
				System.out.println("Empréstimo recusado, vaza daqui!!");
			}
	}

}