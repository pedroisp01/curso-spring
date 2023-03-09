package com.curso;

public class Curso implements Runnable{
	
	public String mostraDados() {
		
		Aluno alunoA = new Aluno();
		System.out.println(alunoA.getNotaAluno(10, 1));
		
		Aluno alunoB = new Aluno();
		System.out.println(alunoB.getNotaAluno(10, 2));
		
		String valor = "Ola";
		
		return valor;
	}

	@Override
	public void run() {
		//TODO Melhorias
		//FIXME Corrigir com mais urgência
		
		
	}
}
