package br.com.senaisp.bauru.secao03.aula05;

public class ShoppingCart02 {

	public static void main(String[] args) {
		// Declarar as variaveis do exercicios
		String custName="Alex"; //nome do cliente
		String itemdesc="camiseta"; //item a ser comprado
		double preco = 5.00;
		double imposto = 18.00;
		int quantidade = 2;
		//montar a mensagem
		double totalPrice = preco * quantidade * (1 + imposto / 100);
		//Vamos precisar ajustar a mensagem para esse exercicio
		String message = custName +" quer comprar " + quantidade + " " + itemdesc + 
				"\nO Custo total com imposto é R$: " + Math.round(totalPrice*100)/100.;
		//math.round arredonda para parte inteira, por isso multipico por 100 e 
		//depois divido por 100. (divisao inteira iria suprimir as casas)
		//Imprimir a mensagem
		System.out.println(message);
	}

}
