package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {
	
	public String nome;
	public String telefone;
	public LocalDate dataNascimento;
	public double peso;
	public double altura;
	public boolean estaInternado;
	
	public void calcularIdade() {
		
	}
	
	public void calcularImc() {
		
	}
	
	public void classificarImc() {
		
	}
	
	public void mostrarFichaPassiente() {
		System.out.println("nome: " + nome);
		System.out.println("altura: " + altura);
		System.out.println("peso: " + peso);
		System.out.println("telefone: " + telefone);
		System.out.println("data de nascimento: " + dataNascimento);
		System.out.println("Internado: " + estaInternado);
		System.out.println("dia da semana de nascimento: " + discubrirODiaDaSemanaCujoOIndividoNasceu());
		System.out.println("=======================================================================================================================================================");

	}
	
	private String discubrirODiaDaSemanaCujoOIndividoNasceu() {
		String diaSemana = dataNascimento.getDayOfWeek().toString();
		return diaSemana;
	}
}
