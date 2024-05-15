package estruturaPosCondicionada;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Escreva o seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Quantas vezes deseja repetir o seu nome: ");
		int vzs = sc.nextInt();
		int i =0;
		
		while (i < vzs) {
			System.out.println(nome);
			i ++;
		}
		
		
		
		sc.close();

	}

}
