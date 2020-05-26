package view;

import model.Individuo;
import model.Congresso;
import model.Instituicao;

public class Teste {
	public static void main(String[] args) {
		Individuo p1 = new Individuo("Williams", 1);
		Individuo p2 = new Individuo("Jos�", 2);
		
		Individuo p3 = new Individuo("Maria", 3);
		Individuo p4 = new Individuo("Jo�o", 4);
		Individuo p5 = new Individuo("Cazalb�", 5);
		
		Instituicao i1 = new Instituicao("Sistema S");
		i1.add(p3);
		i1.add(p4);
		i1.add(p5);
		
		Congresso c1 = new Congresso("1 Milh�o em 1 M�s!!", 5);
		System.out.println(c1.add(p1));
		System.out.println(c1.add(p2));
		System.out.println(c1.add(i1));
		
		System.out.println('\n' + c1.toString() + '\n');
		
		// at� aqui tudo ok, mas vamos estrapolar o limite de participantes
		Individuo p6 = new Individuo("Atrasado", 6);
		
		System.out.println(c1.add(p6));
	}
}
