package org.ucsal.poo.pf20252.br;

/**
 * Enumeração que define os tipos de telas disponíveis na aplicação bancária.
 * Utilizada para controle de navegação entre as diferentes interfaces.
 *
 * @author Daniel e Gabriela
 * @version 1.0
 */
public enum Telas {
    /** Tela inicial de seleção de conta */
    INICIAL,
    /** Tela principal de operações da conta */
    CONTA,
    /** Tela específica para operações de saque */
    SACAR,
    /** Tela específica para operações de depósito */
    DEPOSITAR,
    /** Tela específica para operações de transferência */
    TRANSFERIR,
    /** Tela para geração e visualização de relatórios */
    RELATORIO
}