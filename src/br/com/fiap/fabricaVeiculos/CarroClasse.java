package br.com.fiap.fabricaVeiculos;

import java.util.*;

public class CarroClasse {

	String marca, modelo, cor, tipoCambio, nomeCondutor;

	Date anoFabricacao = new Date();
	Date anoModelo = new Date();
	int renavam;
	String motor;
	double aroRodas, velocidade;
	boolean ligado;
	double limitedevelocidade;

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
		if (!ligado) {
			ligado = true;
			System.out.println("Carro ligado.");
		} else {
			System.out.println("O carro já está ligado.");
		}
	}

	public void desligar() {
		if (ligado && velocidade == 0) {
			ligado = false;
			System.out.println("Carro desligado.");
		} else if (velocidade != 0) {
			System.out.println("O carro precisa estar parado para desligar.");
		} else {
			System.out.println("O carro já está desligado.");
		}
	}

	public void exibirDados() {
		System.out.println("Dados do Carro:");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Ano de Fabricação: " + anoFabricacao);
		System.out.println("Ano do Modelo: " + anoModelo);
		System.out.println("Renavam: " + renavam);
		System.out.println("Motor: " + motor);
		System.out.println("Tipo de Câmbio: " + tipoCambio);
		System.out.println("Aro das Rodas: " + aroRodas);
		System.out.println("Velocidade Atual: " + velocidade + " km/h");
		System.out.println("Nome do Condutor: " + nomeCondutor);
		System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
	}
}
