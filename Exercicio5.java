package estruturaPosCondicionada;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num = 0;
		int soma = 0;
		int i = 0;
		
		while (i < 10) {
			System.out.println("Digite o numero: ");
			num = sc.nextInt();
			soma = num + soma;
			i++;
		}
		System.out.println(soma);
		
		
		sc.close();
		

	}

}
