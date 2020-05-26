package model;

import java.util.ArrayList;
import java.util.List;

public class Congresso {
	private String tema;
	private int totalParticipantes;
	private int totalAssentos;
	List<Instituicao> instituicoes = new ArrayList<Instituicao>();
	List<Individuo> participantes = new ArrayList<Individuo>();
	
	public Congresso(String tema, int totalAssentos) {
		this.tema = tema;
		this.totalAssentos = totalAssentos;
	}
	
	public String add(Instituicao instituicao) {
		if (instituicao.getMembros().size() > totalAssentos) return "Não há assentos suficientes!";
		for(Individuo membro : instituicao.getMembros()) {
			participantes.add(membro);
			totalAssentos -= 1;
			totalParticipantes += 1;
		}
		instituicoes.add(instituicao);
		return "Instituição adicionada com sucesso!";
	}
	
	public String add(Individuo individuo) {
		if(totalAssentos == 0) return "Não há mais assentos disponíveis!";
		participantes.add(individuo);
		totalAssentos -= 1;
		totalParticipantes += 1;
		return "Indivíduo adicionado com sucesso!";
	}
	
	public int getTotalParticipantes() {
		return totalParticipantes;
	}
	
	public int getTotalAssentos() {
		return totalAssentos;
	}

	public String toString() {
		return "Congresso [tema=" + tema 
				+ ",\n totalParticipantes=" + totalParticipantes 
				+ ",\n totalAssentos=" + totalAssentos 
				+ ",\n instituicoes=" + instituicoes 
				+ ",\n participantes=" + participantes + "]";
	}
	
}
