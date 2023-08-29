package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class Contrato {
	private String termosResponsabilidade;
	private int codContrato;
	// Getters e Setters
	public int getCodContrato() {
		return codContrato;
	}

	public void setCodContrato(int codContrato) {
		this.codContrato = codContrato;
	}

	public String getTermosResponsabilidade() {
		return termosResponsabilidade;
	}

	public void setTermosResponsabilidade(String termosResponsabilidade) {
		this.termosResponsabilidade = termosResponsabilidade;
	}
	public void aceitarContrato(String aceitarContrato) {
		if (termosResponsabilidade.equalsIgnoreCase("concordo")) {
			JOptionPane.showMessageDialog(null,"" );
		} else {
			JOptionPane.showMessageDialog(null, "Para prosseguir é necessario aceitar os termos");
			System.exit(0);
		}
		
	}
}
