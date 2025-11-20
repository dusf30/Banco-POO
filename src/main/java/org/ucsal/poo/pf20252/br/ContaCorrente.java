package org.ucsal.poo.pf20252.br;

public class ContaCorrente extends Conta {
	
	public double atualizarSaldo(double valor, int op) {
		if (op == 1) {
			setSaldo(depositar(valor)) ;
		} else {
			setSaldo(sacar(valor));
		}
		return getSaldo();
	}
}
