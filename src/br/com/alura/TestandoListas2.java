package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas2 {

	public static void main(String[] args) {

		String curso1 = "Java SE 8 Programmer I";
		String curso2 = "Mundo J Orientação a Objeto";
		String curso3 = "Apache Camel";

		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		System.out.println("O primeiro curso da lista é : " + cursos.get(0));
		
		cursos.remove(1);
		
		for (int i = 0; i < cursos.size(); i++) {
			System.out.println("curso : " + cursos.get(i));
		}

		cursos.forEach(curso -> {
			System.out.println("curso : " + curso);
		});

		Collections.sort(cursos);
		
		System.out.println("despois de ordenar");
		cursos.forEach(curso -> {
			System.out.println("aula : " + curso);
		});

	}

}
