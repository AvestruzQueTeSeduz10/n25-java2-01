package br.com.senaisp.bauru.secao04.aula08;

import javax.swing.JOptionPane;

public class NameMaker {

	public static void main(String[] args) {
        //Solicitar o nome do meio e sobrenome separadamente
		//Mostrar o nome completo ao termino
		String firstName = JOptionPane.showInputDialog("Digite seu primeiro nome:");
		String middleName = JOptionPane.showInputDialog("Digite seu segundo nome:");
		String lastName = JOptionPane.showInputDialog("Digite seu ultimo nome:");
		JOptionPane.showMessageDialog(null, "seu nome é: " + firstName + " " + middleName + " " + lastName);
	}

}
