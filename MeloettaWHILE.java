package lpa3;

import java.util.Scanner;

public class MeloettaWHILE {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int par=0, impar=0, vale, soma=0, i=1;
		
		while (i <= 10) {
			
			System.out.print("Informe um valor: ");
			vale = ler.nextInt();
			
			if (vale%2 ==0) {
				
				System.out.println("É par.");
				System.out.println("");
				
				par = par + 1;
			}
			else {
				
				System.out.println("É ímpar.");
				System.out.println("");
				impar = impar + 1;
			}
			soma = soma + vale;
			i++;
		}
		System.out.println("A soma dos números é: " + soma);
		System.out.println(par + " desses números são pares e " + impar + " números são ímpares.");
	}

}
