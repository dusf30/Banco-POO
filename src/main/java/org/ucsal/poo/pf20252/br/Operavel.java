package org.ucsal.poo.pf20252.br;

import javafx.scene.control.Label;

/**
 * Interface que define as operações básicas que uma conta bancária deve implementar.
 * Estabelece o contrato para funcionalidades essenciais do sistema bancário.
 *
 * @author Gabriela
 * @version 1.0
 */
public interface Operavel {

    /**
     * Realiza a transferência de um valor para outra conta.
     *
     * @param valor Valor a ser transferido
     * @param destino Conta que receberá a transferência
     */
    void transferir(double valor, Conta destino);

    /**
     * Atualiza o label com o saldo atual da conta ou o oculta.
     *
     * @param saldoConta Label onde o saldo será exibido
     */
    void consultarSaldo(Label saldoConta);

}