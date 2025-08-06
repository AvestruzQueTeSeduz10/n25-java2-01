package br.com.senaisp.bauru.secao03.aula06;

public class parsing01 {

	public static void main(String[] args) {
		int shirtPrice = Integer.parseInt("15");
		double taxRate = Double.parseDouble("0.05");
		String gibberish = "887ds7nds87dsfs";
		//Mostrando os valores
		System.out.println("Preco da camiseta: " + shirtPrice);
		System.out.println("Percentual imposto: " + taxRate);
		//Exemplos de erros de conversão abaixo
		System.out.println("Percentual imposto: " + Integer.parseInt("0.05"));
		System.out.println("gibberish para int: " + Integer.parseInt(gibberish));
	}

}
