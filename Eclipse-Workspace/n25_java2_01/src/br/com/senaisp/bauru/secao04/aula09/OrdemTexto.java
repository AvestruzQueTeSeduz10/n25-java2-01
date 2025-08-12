package br.com.senaisp.bauru.secao04.aula09;

import java.util.Scanner;

public class OrdemTexto {

	public static void main(String[] args) {
        //
		Scanner sc = new Scanner(OrdemTexto.class.getResourceAsStream("palavras.txt"));
		//Definindo variaveis de trabalho 
		String maiorTexto, menorTexto;
		//Setando o maior e menor com o primeiro texto
		maiorTexto = sc.nextLine();
		menorTexto = maiorTexto; // Igualando os enderecos para o mesmo conteudo 
		//Vamos usar o while (ja viu no java1)
		while (sc.hasNextLine()) {
			String apoio = sc.nextLine();
			//Comprando os textos - menor
			if (apoio.compareTo(menorTexto)<0) {
				menorTexto = "" + apoio;
			}
			//Comprando os textos - maior
			if (apoio.compareTo(maiorTexto)<0) {
				maiorTexto = "" + apoio;
			}
		 }
		System.out.println("Maior texto foi " + maiorTexto);
		System.out.println("Menor texto foi " + menorTexto);
		//fechando o arquivo
		sc.close();
	  }
}
