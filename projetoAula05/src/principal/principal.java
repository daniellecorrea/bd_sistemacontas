package principal;

import controllers.ClienteController;

public class principal {

	public static void main(String[] args) {

		ClienteController clienteController = new ClienteController();
		clienteController.cadastrarCliente();

	}

}
