package estruturaPosCondicionada;

import java.util.Scanner;

public class Exercuiciso4 {
	public static void main (String[]args) {
		int i = 0;
		Scanner sc = new Scanner (System.in);
		int idade = 0;
		int soma = 0;
		
		while (i < 20) {
			System.out.println("Qual a idade: ");
			idade = sc.nextInt();
			if (idade >= 18){
				soma = soma + 1;
			}
			i ++;
			
		}
		System.out.println(soma);
	}

}
