package br.ufc.crateus.web.application2.entidades;

public class Aluno {

	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;

	public Aluno( String nome, String cpf, String telefone, String email) {
		setId(id);
		setNome(nome);
		setCpf(cpf);
		setTelefone(telefone);
		setEmail(email);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
