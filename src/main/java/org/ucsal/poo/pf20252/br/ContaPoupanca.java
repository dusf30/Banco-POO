package org.ucsal.poo.pf20252.br;


public class ContaPoupanca extends Conta {
    public ContaPoupanca(long numero, double saldo) {
        super(numero, saldo);
    }


    
    @Override
	public void transferir(double valor, Conta destino) {
		if (valor <= getSaldo()) {
			super.transferir(valor, destino);
		} else {
            System.out.println("Valor indisponível para tranferir.");
        }

	}


    public void atualizarSaldo() {
		setSaldo(getSaldo() + getSaldo()*0.005);
	}


}