package lpa3;

import java.util.Scanner;

public class LarvitarWHILE {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double num, soma=0, i=1;
		
		while (i <= 5) {
			
			System.out.println("Insira um valor: ");
			num = ler.nextDouble();
			
			soma = soma+num;
		
		i++;
		}
		double media = soma/5;
		System.out.println("A soma dos números é: " + soma);
		System.out.println("A média é: " + media);

	}

}
