package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.*;

public class UsaVistoria {

	public static void main(String[] args) {
	
		Autenticacao autenticacao = new Autenticacao();
		Bicicleta bike = new Bicicleta();
		CadastroPorto porto = new CadastroPorto();
		Contrato contrato = new Contrato();
		StatusVistoria status = new StatusVistoria();
		Vistoria vistoria = new Vistoria();
		Notificacao notificacao = new Notificacao();
		Relatorio rela = new Relatorio();
		//dados com parâmetros por virem direto da Porto para o sistema 
		//Dados da bike tmb
		porto.setNome("Berisvaldo");
		porto.setCulular(912345789);
		porto.setCpf(1245121245);
		porto.setRg(1231544654);
		porto.setEndereco("Rua Astrogildo, Número 22");
		porto.setEmail("Berisvaldo.gmail.com");
		porto.setIdcadastro(4556);
		autenticacao.setCodigoAutenticacao(1234);
		vistoria.setNumProtocolo(1234);
		bike.setCambio("Padrão de fabrica");
		bike.setFreio("Padrão de fabrica");
		bike.setMarcaBike("Padrão de fabrica");
		bike.setMarcaCambio("Padrão de fabrica");
		bike.setModeloBike("Padrão de fabrica");
		bike.setNumMarchas("Padrão de fabrica");
		bike.setPedal("Padrão de fabrica");
		bike.setPneu("Padrão de fabrica");
		bike.setQuadro("Padrão de fabrica");
		bike.setRoda("Padrão de fabrica");
		//tamanho do quadro em mm
		bike.setTamanhoQuadro(29.5f);
		bike.setTipoFreio("Padrão de fabrica");
		contrato.setCodContrato(1324);		
		notificacao.setAssunto("Vistoria ");
		notificacao.setDestinatario(porto.getNome());
		notificacao.setMensagem("Vistoria iniciada");
		rela.setConteudo("Nenhuma vistoria feita anteriormente");
		rela.setTitulo("Relatório: vistoria ainda não foi iniciada");
		//classe relatório ainda vai receber modificaçãoes na forma que capta a resposta e entrega no final para o cliente
		
		JOptionPane.showConfirmDialog(null,

		rela.getConteudo() +"\n" +  
		rela.getTitulo());
		
		JOptionPane.showConfirmDialog(null,
		"---Aviso---"+
		"\nDestinatário: " + notificacao.getDestinatario() + 
		"\nAssunto: " + notificacao.getAssunto()+
		"\n" + notificacao.getMensagem());
		JOptionPane.showConfirmDialog(null,
		 "Seus dados: "+
		 "\nNome: " + porto.getNome() +
		 "\nCelular: " +porto.getCelular() +
		 "\nCPF: " + porto.getCpf() + 
		 "\nRG: " + porto.getRg() +
		 "\nEndereço: " + porto.getEndereco() + 
		 "\nEmail: " + porto.getEmail() + 
		 "\nId cadastro Porto:" + porto.getIdcadastro() + 
		 "\nCódigo de autenticação: " + autenticacao.getCodigoAutenticacao() + 
		 "\nNúmero de protocolo: " + vistoria.getNumProtocolo());
		
		try {
			String contrato1 = JOptionPane.showInputDialog("Condorda com os termos? (s/n)\n"+ "Código: " + contrato.getCodContrato());
			contrato1.equalsIgnoreCase(("Condordo"));			

			String iniciar = JOptionPane.showInputDialog("Iniciar vistoria dos pneus? (s/n) ");
			if (iniciar.equalsIgnoreCase("s")) {
				String pneuDianteiro = JOptionPane.showInputDialog("O pneu dianteiro está em bom estado? (s/n) ");
				String pneuTraseiro = JOptionPane.showInputDialog("O pneu traseiro está em bom estado? (s/n) ");
				if (pneuDianteiro.equalsIgnoreCase("s") && pneuTraseiro.equalsIgnoreCase("s")) {
					status.setStatusPneu(1);
					status.pneu();
				} else {
					status.setStatusPneu(0);
					status.pneu();
				}
			} else {
				status.setStatusPneu(0);
				status.pneu();
			}

			iniciar = JOptionPane.showInputDialog("Iniciar vistoria das rodas? (s/n) ");
			if (iniciar.equalsIgnoreCase("s")) {
				String rodaDianteira = JOptionPane.showInputDialog("A roda dianteiro está em bom estado? (s/n) ");
				String rodaTraseira = JOptionPane.showInputDialog("A roda traseiro está em bom estado? (s/n) ");
				if (rodaDianteira.equalsIgnoreCase("s") && rodaTraseira.equalsIgnoreCase("s")) {
					status.setStatusRoda(1);
					status.roda();
				} else {
					status.setStatusRoda(0);
					status.roda();
				}
			} else {
				status.setStatusRoda(0);
				status.roda();
			}
			iniciar = JOptionPane.showInputDialog("Iniciar vistoria dos freios? (s/n) ");
			if (iniciar.equalsIgnoreCase("s")) {
				String pastilhas = JOptionPane.showInputDialog("As pastilhas de freio estão em bom estado? (s/n) ");
				String caboFreio = JOptionPane.showInputDialog("O cabo de freio está em bom estado? (s/n) ");
				if (pastilhas.equalsIgnoreCase("s") && caboFreio.equalsIgnoreCase("s")) {
					status.setStatusFreio(1);
					status.freio();
				} else {
					status.setStatusFreio(0);
					status.freio();
				}
			} else {
				status.setStatusFreio(0);
				status.freio();
			}
			iniciar = JOptionPane.showInputDialog("Iniciar vistoria do quadro? (s/n) ");
			if (iniciar.equalsIgnoreCase("s")) {
				String quadro = JOptionPane.showInputDialog("O quadro está em bom estado? (s/n) ");
				if (quadro.equalsIgnoreCase("s")) {
					status.setStatusQuadro(1);
					status.quadro();
				} else {
					status.setStatusQuadro(0);
					status.quadro();
				}
			} else {
				status.setStatusQuadro(0);
				status.quadro();
			}

			iniciar = JOptionPane.showInputDialog("Iniciar vistoria dos pedais? (s/n) ");
			if (iniciar.equalsIgnoreCase("s")) {
				String pedais = JOptionPane.showInputDialog("Os pedais estão em bom estado? (s/n) ");
				if (pedais.equalsIgnoreCase("s")) {
					status.setStatusPedal(1);
					status.pedal();
				} else {
					status.setStatusPedal(0);
					status.pedal();
				}
			} else {
				status.setStatusPedal(0);
				status.pedal();
			}

			iniciar = JOptionPane.showInputDialog("Iniciar vistoria do câmbio? (s/n) ");
			if (iniciar.equalsIgnoreCase("s")) {
				String cambio = JOptionPane.showInputDialog("O câmbio estão em bom estado? (s/n) ");
				if (cambio.equalsIgnoreCase("s")) {
					status.setStatusCambio(1);
					status.cambio();
				} else {
					status.setStatusCambio(0);
					status.cambio();
				}
			} else {
				status.setStatusCambio(0);
				status.cambio();
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Algo deu errado ");
		}
	}
}