package principal;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		//syso + CTRL + espaço
		System.out.println("\n *** CADASTRO DE FUNCIONÁRIO *** \n");
		
		Funcionario funcionario = new Funcionario();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com o id do funcionário.....: ");
		funcionario.setIdFuncionario(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("Entre com o nome do funcionário...: ");
		funcionario.setNome(scanner.nextLine());
		
		System.out.print("Entre com a matrícula.............: ");
		funcionario.setMatricula(scanner.nextLine());
		
		System.out.print("Entre com o cpf...................: ");
		funcionario.setCpf(scanner.nextLine());
		
	}

}
