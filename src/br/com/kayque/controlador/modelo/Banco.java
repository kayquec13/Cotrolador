package br.com.kayque.controlador.modelo;

import java.util.ArrayList;
import java.util.List;


public class Banco {
	
	private static List<Professor> listaProfessor = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Professor professor = new Professor("Rivail",1);
		Professor professor2 = new Professor("Valente",2);

		
		listaProfessor.add(professor);
		listaProfessor.add(professor);
	}
	

	public List<Professor> getProfessor(){
		return Banco.listaProfessor;
	}
}
