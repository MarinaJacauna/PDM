package com.example.exercicioaula7bv3.model;

public class Aluno {

	// ... declarar os outros atributos da classe Aluno
	// Dica:
	// utilize click direito / Refactor / Encapsulate Fields...
	// e click direito / Generate
	// para gerar automaticamente todos os métodos get/set, construtores, toString()
	// ...

	private String rgm;
	private String nome;
	private float nota_parcial ;
	private float nota_trabs;
	private float nota_reg;

	public Aluno() {	}

	public Aluno(String rgm, String nome, float nota_parcial, float nota_trabs, float nota_reg ){
		this.rgm = rgm;
		this.nome = nome;
		this.nota_parcial = nota_parcial;
		this.nota_trabs = nota_trabs;
		this.nota_reg = nota_reg;
	}


	public void setRgm(String rgm) {
		this.rgm = rgm;
	}

	public String getRgm() {
		return rgm;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNota_parcial(float nota_parcial) {
		this.nota_parcial = nota_parcial;
	}

	public float getNota_parcial() {
		return nota_parcial;
	}

	public void setNota_trabs(float nota_trabs) {
		this.nota_trabs = nota_trabs;
	}

	public float getNota_trabs() {
		return nota_trabs;
	}

	public float getNota_reg() {
		return nota_reg;
	}

	public void setNota_reg(float nota_reg) {
		this.nota_reg = nota_reg;
	}

	@Override
	public String toString() {
		return "Aluno{"+
				" RGM='" + rgm + '\''+
				", nome='" + nome + '\'' +
				", nota parcial=" + nota_parcial+
				", nota trabalho=" + nota_trabs+
				", nota regimental=" + nota_reg+
				'}';

}

}
