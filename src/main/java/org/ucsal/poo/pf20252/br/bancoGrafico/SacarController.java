package org.ucsal.poo.pf20252.br.bancoGrafico;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.ucsal.poo.pf20252.br.Conta;
import org.ucsal.poo.pf20252.br.ValorInvalidoException;

/**
 * Controlador para a tela de saque da aplicação bancária.
 * Gerencia a operação de saque em contas com tratamento de exceções.
 *
 * @author Daniel
 * @version 1.0
 * @see GeraisController
 * @see ValorInvalidoException
 */
public class SacarController extends GeraisController{

    /**
     * Executa a operação de saque na conta alvo.
     * Processa o valor, realiza validações e trata possíveis exceções.
     * Exibe mensagens de sucesso ou erro conforme o resultado da operação.
     */
    @FXML
    protected void sacarBtn(){
        try {
            String texto = getCampoInput().getText().trim().replace(",",".");
            getContaAlvo().sacar(Double.parseDouble(texto));
            mostrarSucesso("Saque concluído");
        } catch (NumberFormatException e) {
            mostrarErro("Digite um número válido");
        } catch (ValorInvalidoException e){
            mostrarErro("Saldo insuficiente");
        } finally {
            getCampoInput().setText("");
        }
    }
}