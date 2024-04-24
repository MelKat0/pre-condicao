package lpa3;

import java.util.Scanner;

public class KeldeoWHILE {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int impra, i = 0;
		
		System.out.println("Insira um valor limite: ");
		impra = ler.nextInt();
		
		while (i <= impra) {
			if (i%2 !=0) {
				System.out.println(i + " é ímpar");
			}
			
			i++;
		}
		ler.close();
	}

}
