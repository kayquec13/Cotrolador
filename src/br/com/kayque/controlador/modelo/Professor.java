package br.com.kayque.controlador.modelo;

import java.util.ArrayList;
import java.util.List;

public class Professor {

	private String nome;
	private int id;
	private static List<Aluno> alunos = new ArrayList<Aluno>();
	
	public Professor(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static List<Aluno> getAlunos() {
		return alunos;
	}

	public static void setAlunos(List<Aluno> alunos) {
		Professor.alunos = alunos;
	}
	
	

	
	
}
