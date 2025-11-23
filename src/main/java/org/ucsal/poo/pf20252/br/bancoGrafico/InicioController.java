package org.ucsal.poo.pf20252.br.bancoGrafico;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.ucsal.poo.pf20252.br.ContaCorrente;
import org.ucsal.poo.pf20252.br.Telas;

/**
 * Controlador para a tela inicial da aplicação bancária.
 * Gerencia a navegação para as diferentes tipos de conta.
 *
 * @author Daniel
 * @version 1.0
 * @see Telas
 */
public class InicioController {
    @FXML
    protected Button btnCorrente;

    @FXML
    protected Button btnPoupanca;

    /**
     * Navega para a tela da conta corrente quando o botão correspondente é clicado.
     *
     */
    @FXML
    protected void onContaCorrenteClick() {
        MainApplication.changeScreen(Telas.CONTA, MainApplication.getContaCorrente());
    }

    /**
     * Navega para a tela da conta poupança quando o botão correspondente é clicado.
     *
     */
    @FXML
    protected void onContaPoupancaClick() {
        MainApplication.changeScreen(Telas.CONTA, MainApplication.getContaPoupanca());
    }
}