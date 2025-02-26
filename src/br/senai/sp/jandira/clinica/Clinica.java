/*
 * Progamador: Gustavo de Paula
 * Empresa: SENAI
 * DATA: 19/2/2025 
 */
package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {
	public static void main(String[] args) {
		// Criação dos objetos
		Paciente p1 = new Paciente();
		p1.nome = "luiz";
		p1.setAltura(2.15);
		p1.setPeso(200);
		p1.telefone = "(11)4002-8922";
		p1.dataNascimento = LocalDate.of(2003, 7, 1);
		p1.estaInternado = true;

		p1.calcularIdade();

		Paciente p2 = new Paciente();
		p2.nome = "Gustavo de Paula Silva";
		p2.setAltura(1.7);
		p2.setPeso(80);
		p2.telefone = "11 xxxx-xxxx";
		p2.dataNascimento = LocalDate.of(2009, 2, 14);
		p2.estaInternado = false;

		p1.mostrarFichaPassiente();
		p2.mostrarFichaPassiente();

	}

}
