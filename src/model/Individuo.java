package model;

public class Individuo implements ElementosComuns {
	private int assento;
	private String nome;

	public Individuo(String nome, int assento) {
		this.nome = nome;
		this.assento = assento;
	}
	
	public int getAssento() {
		return assento;
	}

	public String toString() {
		return "Individuo [assento=" + assento + ", nome=" + nome + "]";
	}
	
}
