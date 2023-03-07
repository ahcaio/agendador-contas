package br.com.caio.agendadorcontas.entity;

public class Cliente {
	private Long id;
	private String nome;
	private String sobrenome;
	private long idade;
	
	
	public Cliente(Long id, String nome, String sobrenome, long idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public long getIdade() {
		return idade;
	}


	public void setIdade(long idade) {
		this.idade = idade;
	}
	
	
	
	
	
}

