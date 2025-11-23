package org.ucsal.poo.pf20252.br;

import javafx.scene.control.Label;
import java.util.Scanner;

public abstract class Conta implements Operavel {
	long numero;
	private boolean saldoVisivel = false;
	private double saldo;

	public Conta(long numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public void depositar(double valor) throws ValorInvalidoException{
		if (valor <=0){
			throw new ValorInvalidoException();
		}
		saldo += valor;

    }

	public void sacar(double valor) {
		if (valor > saldo){
			throw new ValorInvalidoException();
		}
		saldo -= valor;
    }


	@Override
	public void transferir(double valor, Conta destino) {
		if (valor <= saldo) {
			saldo -= valor;
			destino.saldo += valor;
		}

	}

	@Override
	public void consultarSaldo(Label saldoConta) {
		saldoVisivel = !saldoVisivel;
		if (saldoVisivel) {
			saldoConta.setText(String.format("%.2f", saldo));
		} else {
			saldoConta.setText("*****");
		}

	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
}


