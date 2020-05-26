package model;

import java.util.ArrayList;
import java.util.List;

public class Instituicao implements ElementosComuns {
	private String nome;
	
	public Instituicao(String nome) {
		this.nome = nome;
	}

	List<Individuo> membros = new ArrayList<Individuo>();

	public void add(Individuo membro) {
		membros.add(membro);
	}
	
	public List<Individuo> getMembros() {
		return membros;
	}

	public String toString() {
		return "Instituicao [nome=" + nome + ", membros=" + membros + "]";
	}
	
}
