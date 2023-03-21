package controllers;

import entities.Profissional;
import entities.Servico;
import enums.TipoPagamento;
import helpers.InputHelper;
import repositories.ProfissionalRepository;

public class ProfissionalController {

	//método para realizar o fluxo de cadastro de um profissional..
	public void cadastrarProfissional() {
		
		System.out.println("\n*** CADASTRO DE PROFISSIONAL ***\n");
				
		Profissional profissional = new Profissional();
		Servico servico = new Servico();
		
		InputHelper inputHelper = new InputHelper();
		
		//Sistema solicita que o usuário entre
		//com os dados do Profissional
		profissional.setId(Integer.parseInt(inputHelper.inputData("ID DO PROFISSIONAL: ")));
		profissional.setNome(inputHelper.inputData("NOME DO PROFISSIONAL: "));
		profissional.setCpf(inputHelper.inputData("CPF DO PROFISSIONAL: "));
		profissional.setEmail(inputHelper.inputData("EMAIL DO PROFISSIONAL: "));
		profissional.setTelefone(inputHelper.inputData("TELEFONE DO PROFISSIONAL: "));
		
		//Sistema solicita que o usuário entre
		//com os dados do Serviço
		servico.setNome(inputHelper.inputData("NOME DO SERVIÇO: "));
		servico.setValor(Double.parseDouble(inputHelper.inputData("VALOR DO SERVIÇO: ")));
		
		String opcao = inputHelper.inputData("TIPO DE PAGAMENTO (C)Crédito, (D)Débito ou (P)Pix: ");
		switch(opcao) {
		
		case "C":
			servico.setTipoPagamento(TipoPagamento.CRÉDITO);
			break;
			
		case "D":
			servico.setTipoPagamento(TipoPagamento.DÉBITO);
			break;
			
		case "P":
			servico.setTipoPagamento(TipoPagamento.PIX);
			break;
		}
		
		//associar o profissional ao serviço
		profissional.setServico(servico);
		
		try {
			
			ProfissionalRepository profissionalRepository = new ProfissionalRepository();
			profissionalRepository.exportarDados(profissional);
			
			System.out.println("\nPROFISSIONAL CADASTRADO COM SUCESSO!");
		}
		catch(Exception e) {
			System.out.println("\nERRO: " + e.getMessage());
		}
	
		System.out.println("\nFIM!");
	}	
}



