package br.com.fiap.bean;

public class CadastroPorto {
	private String nome , email, endereco;
	private int celular, idcadastro;
	private double cpf, rg;
	
	
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	public double getRg() {
		return rg;
	}
	public void setRg(double rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCelular() {
		return celular;
	}
	public void setCulular(int culular) {
		this.celular = culular;
	}
	public int getIdcadastro() {
		return idcadastro;
	}
	public void setIdcadastro(int idcadastro) {
		this.idcadastro = idcadastro;
	}
}
