package br.com.senaisp.bauru.secao03.aula06;

import javax.swing.JOptionPane;

public class Exercicio01 {
	public static void main(String[] args) {
		JOptionPane.showConfirmDialog(null,
                "Ola participante, e bem vindo ao programa de namoro favorito da america!",
                "Bem-vindo, participante!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
		 
		 String input1 = (String)JOptionPane.showInputDialog(null,
	                "Qual é o seu nome?",
	                "Questao 1",
	                JOptionPane.QUESTION_MESSAGE,
	                null,
	                null,
	                "String.");
		 String[] acceptableValues = {"Real Madrid", "Barcelona", "Manchester City", "Atletico De Madrid", "River Plate"};
	        String input2 = (String)JOptionPane.showInputDialog(null,
	                "Julian Alvarez",
	                "Questão 2",
	                JOptionPane.QUESTION_MESSAGE,
	                null,
	                acceptableValues,
	                acceptableValues[3]);
	}
}
