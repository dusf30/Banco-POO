package org.ucsal.poo.pf20252.br.bancoGrafico;

import javafx.fxml.FXML;
import org.ucsal.poo.pf20252.br.ValorInvalidoException;

/**
 * Controlador para a tela de depósito da aplicação bancária.
 * Gerencia a operação de depósito em contas com tratamento de exceções.
 *
 * @author Daniel
 * @version 1.0
 * @see GeraisController
 * @see ValorInvalidoException
 */
public class DepositarController extends GeraisController{

    /**
     * Executa a operação de depósito na conta alvo.
     * Processa o valor, realiza validações e trata possíveis exceções.
     * Exibe mensagens de sucesso ou erro conforme o resultado da operação.
     */
    @FXML
    protected void depositarBtn(){
        try {
            String texto = getCampoInput().getText().trim().replace(",",".");
            getContaAlvo().depositar(Double.parseDouble(texto));
            mostrarSucesso("Deposito concluído");
        } catch (NumberFormatException e) {
            mostrarErro("Digite um número válido");
        } catch (ValorInvalidoException e){
            mostrarErro("Só é possível depositar valores maiores que 0,00.");
        } finally {
            getCampoInput().setText("");
        }
    }
}