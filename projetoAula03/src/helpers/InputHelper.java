package helpers;

import javax.swing.JOptionPane;

public class InputHelper {

	//método para fazer a captura de 
	//um dado informado pelo usuário
	public String inputData(String message) {
		
		String valor = JOptionPane.showInputDialog(message);
		return valor;
	}	
}



