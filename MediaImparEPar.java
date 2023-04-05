package com.vitorcamara.projetos;

import java.util.Scanner;

public class MediaImparEPar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int somaImpar = 0;
		int qtdImpar = 0;
		int somaPar = 0;
		int qtdPar = 0;

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor do indice " + i + ":");
			vetorA[i] = scan.nextInt();

			if (vetorA[i] % 2 != 0) {  //se for ímpar,  
				qtdImpar++;            //qtdImpar recebe +1
				somaImpar += vetorA[i];//somaImpar recebe os valores ímpares 
			} else if (vetorA[i] % 2 == 0) {
				qtdPar++;
				somaPar += vetorA[i];
			}

		}

		int mediaImpar = somaImpar / qtdImpar;
		int mediaPar = somaPar / qtdPar;

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("indice " + i + ": " + vetorA[i]);
		}

		System.out.println("\nSoma dos ímpares = " + somaImpar);
		System.out.println("Média dos ímpares = " + mediaImpar);

		System.out.println("\nSoma dos pares = " + somaPar);
		System.out.println("Média dos pares = " + mediaPar);
	}

}
