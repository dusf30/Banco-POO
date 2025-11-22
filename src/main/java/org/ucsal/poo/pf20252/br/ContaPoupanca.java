package org.ucsal.poo.pf20252.br;

import java.util.Scanner;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(long numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void sacar() {
		Scanner saq = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = saq.nextDouble();
        if (valor <= getSaldo()) {
        	super.sacar();
        } else { System.out.println("Valor indisponível para saque.");}
        
    }
    
    @Override
	public void transferir(double valor, Conta destino) {
		if (valor <= getSaldo()) {
			super.transferir(valor, destino);
		} else { System.out.println("Valor indisponível para tranferir."); }

	}
    
    
    @Override
    public void atualizarSaldo() {
		setSaldo(getSaldo() + getSaldo()*0.005);
	}


}