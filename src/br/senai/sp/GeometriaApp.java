package br.senai.sp;

import br.senai.sp.model.Triangulo;

public class GeometriaApp {

	public static void main(String[] args) {
		
	 System.out.println("Criando triângulos...");

	 // Criando dois triângulos
	 Triangulo t1 = new Triangulo();
	 Triangulo t2 = new Triangulo();
	 Triangulo t3 = new Triangulo ();
	 
	 // Definindo as propriedades dos triângulos
	 t1.altura = 20;
	 t1.base = 22;
	 t1.ladoB = 9;
	 t1.ladoC = 10;
	 t1.nome = "Triângulo 001";
	 
	 t2.altura = 12;
	 t2.ladoC = 5;
	 t2.ladoB = 9;
	 t2.base = 10;
	 t2.nome = "Triângulo 002";
	 
	 t3.altura = 9;
	 t3.base = 16;
	 t3.ladoB = 12;
	 t3.ladoC = 13;
	 t3.nome = "Triângulo 003";
	 
	 //Exibir dados do Triâgulo
	 t1.exibirDados();
	 t2.exibirDados();
	 t3.exibirDados();
	 
	 
	}
	 
}

