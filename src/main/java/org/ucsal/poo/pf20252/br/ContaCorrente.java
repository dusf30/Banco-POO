package org.ucsal.poo.pf20252.br;

public class ContaCorrente extends Conta {

	private final double LIMITE_SAQUE_ESPECIAL = 2000;

	public ContaCorrente(long numero, double saldo) {
		super(numero, saldo);
	}

	@Override
	public void sacar(double valor) {
		if (valor > getSaldo() + LIMITE_SAQUE_ESPECIAL){
			throw new ValorInvalidoException();
		}
		setSaldo(getSaldo() - valor);
	}

}