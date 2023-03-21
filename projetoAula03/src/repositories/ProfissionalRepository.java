package repositories;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import entities.Profissional;

public class ProfissionalRepository {

	//método para gravar os dados do profissional
	//em um arquivo na máquina do usuário
	public void exportarDados(Profissional profissional) throws Exception {
		
		//abrindo um arquivo para gravação
		PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("c:\\temp\\profissionais.txt"), true));
		
		//escrevendo os dados
		printWriter.write("\nID DO PROFISSIONAL....: " + profissional.getId());
		printWriter.write("\nNOME DO PROFISSIONAL..: " + profissional.getNome());
		printWriter.write("\nCPF...................: " + profissional.getCpf());
		printWriter.write("\nTELEFONE..............: " + profissional.getTelefone());
		printWriter.write("\nEMAIL.................: " + profissional.getEmail());
		printWriter.write("\nNOME DO SERVIÇO.......: " + profissional.getServico().getNome());
		printWriter.write("\nVALOR DO SERVIÇO......: " + profissional.getServico().getValor());
		printWriter.write("\nTIPO DE PAGAMENTO.....: " + profissional.getServico().getTipoPagamento());
		printWriter.write("\n...");
		
		//salvando e fechando o arquivo
		printWriter.flush();
		printWriter.close();
	}
	
}



