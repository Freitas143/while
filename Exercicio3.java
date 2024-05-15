package estruturaPosCondicionada;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		int i = 0;
		do {
			System.out.println(nome);
			i ++;
		}
		while(i < 10);
		
		
		
		sc.close();

	}

}
