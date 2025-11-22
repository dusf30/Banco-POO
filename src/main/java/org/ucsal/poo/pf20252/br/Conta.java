package org.ucsal.poo.pf20252.br;

public abstract class Conta {
	
	long numero;
	private double saldo = 0;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
	this.saldo=saldo;
	}
	
	public double depositar(double valor){
		if (valor > 0) {
			return (saldo + valor);
		} else {
			System.out.println("Só é possível depositar valores maiores que 0,00.");
			return saldo;
		}
	}


	public double sacar(double valor) {
		return (saldo - valor);
	}
	
	public double atualizarSaldo(double valor, int op) {
		if (op == 1) {
			saldo = depositar(valor);
		} else {
			saldo = sacar(valor);
		}
		return saldo;
	}
	
}
