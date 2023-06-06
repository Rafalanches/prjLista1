package pacote_exercicio8;

import java.util.Scanner;

public class exercicio8 {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	double H;
	int opçao;
	System.out.println("Qual a altura do gigante que tu é? ");
	H = entrada.nextDouble();
	System.out.println("Escolha a opcao: \n");
	System.out.println("1- Masculino \n");
	System.out.println("2- Feminino \n");
	System.out.println("Qualé tua opção: ");
	opçao = entrada.nextInt();
	
     switch(opçao) {
     
    	 case 1:
        	  System.out.println("O seu peso ideal é: "+ ((72.7*H)-58)+" meu nobre");
        	  break;
    	 case 2:
        	  System.out.println("O seu peso ideal é: "+ ((62.1*H)-44.7) +"minha rainha");
        	  break;
      		}
		}
	}