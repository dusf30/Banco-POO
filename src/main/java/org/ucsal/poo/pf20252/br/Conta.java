package org.ucsal.poo.pf20252.br;

import org.ucsal.poo.pf20252.br.bancoGrafico.DepositarController;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Conta implements Operavel {

	long numero;
	private double saldo;

	public Conta(long numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public void depositar(double valor) throws IllegalArgumentException{
		if (valor <=0){
			throw new IllegalArgumentException();
		}
		saldo += valor;

    }

	public void sacar() {
        try {
            Scanner saq = new Scanner(System.in);
            System.out.println("Digite o valor do saque: ");
            double valor = saq.nextDouble();
            saldo -= valor;
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Digite um número válido");
		}
    }


	@Override
	public void transferir(double valor, Conta destino) {
		if (valor <= saldo) {
			saldo -= valor;
			destino.saldo += valor;
		}

	}

	@Override
	public void consultarSaldo() {
		System.out.println(getSaldo());

	}



	public double getSaldo() {
		return saldo;
	}

}


