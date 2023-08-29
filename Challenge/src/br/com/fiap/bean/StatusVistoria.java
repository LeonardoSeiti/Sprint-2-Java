package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class StatusVistoria {
	private int statusGeral, statusFreio, statusPneu, statusCambio, statusPedal, statusRoda, statusQuadro;
	// Getters e Setters
	public int getStatusGeral() {
		return statusGeral;
	}

	public void setStatusGeral(int statusGeral) {
		this.statusGeral = statusGeral;
	}

	public int getStatusFreio() {
		return statusFreio;
	}

	public void setStatusFreio(int statusFreio) {
		this.statusFreio = statusFreio;
	}

	public int getStatusPneu() {
		return statusPneu;
	}

	public void setStatusPneu(int statusPneu) {
		this.statusPneu = statusPneu;
	}

	public int getStatusCambio() {
		return statusCambio;
	}

	public void setStatusCambio(int statusCambio) {
		this.statusCambio = statusCambio;
	}

	public int getStatusPedal() {
		return statusPedal;
	}

	public void setStatusPedal(int statusPedal) {
		this.statusPedal = statusPedal;
	}

	public int getStatusRoda() {
		return statusRoda;
	}

	public void setStatusRoda(int statusRoda) {
		this.statusRoda = statusRoda;
	}

	public int getStatusQuadro() {
		return statusQuadro;
	}

	public void setStatusQuadro(int statusQuadro) {
		this.statusQuadro = statusQuadro;
	}

	// metodos
	// freios, pedal, quadro, pneu, roda e cambio
	public void freio() {
		if (statusFreio == 1) {
			JOptionPane.showMessageDialog(null, "Freios verificados");
		} else {
			JOptionPane.showMessageDialog(null, "Freios recusados");
		}

	}

	public void pedal() {
		if (statusPedal == 1) {
			JOptionPane.showMessageDialog(null, "Pedais verificados");
		} else {
			JOptionPane.showMessageDialog(null, "Pedais recusados");
		}

	}

	public void quadro() {
		if (statusQuadro == 1) {
			JOptionPane.showMessageDialog(null, "Quadro verificado");
		} else {
			JOptionPane.showMessageDialog(null, "Quadro recusado");
		}

	}

	public void pneu() {
		if (statusPneu == 1) {
			JOptionPane.showMessageDialog(null, "Pneus verificados");
		} else {
			JOptionPane.showMessageDialog(null, "Pneus recusados");
		}
	}

	public int roda() {
		if (statusRoda == 1) {
			JOptionPane.showMessageDialog(null, "Rodas verificados");
		} else {
			JOptionPane.showMessageDialog(null, "Rodas recusados");
		}
		return statusRoda;
	}

	public int cambio() {
		if (statusFreio == 1) {
			JOptionPane.showMessageDialog(null, "Cambio verificados");
		} else {
			JOptionPane.showMessageDialog(null, "Cambio recusados");
		}
		return statusCambio;
	}
}
