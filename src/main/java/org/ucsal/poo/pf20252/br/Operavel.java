package org.ucsal.poo.pf20252.br;

import javafx.scene.control.Label;

public interface Operavel {

    void transferir(double valor, Conta destino);
    void consultarSaldo(Label saldoConta);

}