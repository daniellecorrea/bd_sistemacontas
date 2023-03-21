package controllers;

import java.util.Scanner;

import entities.Cliente;
import repositories.ClienteRepository;

public class ClienteController {
	
	
	public void cadastrarCliente() {
		
		try {
			
			System.out.println("\nCADADASTRO DE CLIENTE");
			
		Cliente cliente = new Cliente();
		Scanner scanner = new Scanner(System.in);
			
		
		System.out.println("NoME DO CLIENTE");
		cliente.setNome(scanner.nextLine());
		
		System.out.println("NoME DO CLIENTE");
		cliente.setEmail(scanner.nextLine());
		
		
		ClienteRepository clienteRepository = new ClienteRepository();
		clienteRepository.create(cliente);
		
		System.out.println("\n CLIENTE CADASTRADO COM SUCESSO!");
		
		}catch(Exception e){
			System.out.println("\n FALHA AO CADASTRAR O CLIENTE");
			e.printStackTrace();
			
		}
		
	}

}
