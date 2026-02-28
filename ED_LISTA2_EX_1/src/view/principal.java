package view;
import javax.swing.*;
import controller.metodos;
public class principal {

	public static void main(String[] args) {
		metodos m = new metodos();

		  int a = Integer.parseInt(
		          JOptionPane.showInputDialog("Digite um valor para A:"));

		  int b = Integer.parseInt(
		          JOptionPane.showInputDialog("Digite um valor para B:"));

		  int resultado = m.multiplicar(a, b);

		  JOptionPane.showMessageDialog(null,
		          "Resultado: " + resultado);
	}

}
