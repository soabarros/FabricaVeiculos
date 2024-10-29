package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Caminhao {
// atributos
	String marcacaminhao, modelocaminhao, corcaminhao, motorcaminhao, cambiocaminhao, tipodecarga, nomecondutor;
	Date anoFabricacao = new Date();
	Date anoModelo = new Date();
	int renavam, qtcargaabastecida,qtcargasupotada; 
	double arorodas, velocidade;
	boolean ligado= false ;
	
	//metodos
	public void carregar (double valor ) {
		qtcargaabastecida+=valor;
		if(qtcargaabastecida>qtcargasupotada) {
			qtcargaabastecida=qtcargasupotada;
		}
	}
	
	public void descarregar (double valor ) {
		qtcargaabastecida-=valor;
		if(qtcargaabastecida<0) {
			qtcargaabastecida=0;
			
		}
	}
	
	
	
	
	public void acelerar(double valor) {
		if (this.ligado) {
			this.velocidade += valor;
		}
	}

	public void frear(double valor) {
		if (this.velocidade > 0) {
			this.velocidade -= valor;
		}
	}

	// Métodos
	public void ligar() {
		if (this.ligado) {
			this.ligado = true;
			System.out.println("Caminhao ligado.");
		} else {
			System.out.println("O cainhao já está ligado.");
		}
	}

	public void desligar() {
		if (this.ligado && this.velocidade == 0) {
			this.ligado = false;
			System.out.println("Caminhao desligado.");
		} else if (this.velocidade != 0) {
			System.out.println("O caminhao precisa estar parado para desligar.");
		} else {
			System.out.println("O caminhao já está desligado.");
		}
	}

	
	
	
	
	public void exibirDados() {
		System.out.println("Dados do Caminhao:");
		System.out.println("Marca: " + this.marcacaminhao);
		System.out.println("Modelo: " + this.modelocaminhao);
		System.out.println("Cor: " + this.corcaminhao);
		System.out.println("Ano de Fabricação: " + this.anoFabricacao);
		System.out.println("Ano do Modelo: " + this.modelocaminhao);
		System.out.println("Renavam: " + this.renavam);
		System.out.println("Motor: " + this.motorcaminhao);
		System.out.println("Tipo de Câmbio: " + this.cambiocaminhao);
		System.out.println("Aro das Rodas: " + this.arorodas);
		System.out.println("Velocidade Atual: " +this.velocidade  + " km/h");
		System.out.println("Nome do Condutor: " + this.nomecondutor);
		System.out.println("Status: " + (this.ligado ? "Ligado" : "Desligado"));
	}
	
	
	
	
	
	
}
