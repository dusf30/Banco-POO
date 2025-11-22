package org.ucsal.poo.pf20252.br;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(double saldo) {
		super(saldo);
	}

	public double atualizarSaldo(double valor, int op) {
		if (op == 1) {
			setSaldo(depositar(valor)) ;
		} else {
			if (valor <= getSaldo()) {
				setSaldo(sacar(valor));
			} else {
				System.out.println("O valor de saque desejado está acima do valor de saldo da conta.");
			}
		}
		return getSaldo();
	}
}
