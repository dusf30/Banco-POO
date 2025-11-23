package org.ucsal.poo.pf20252.br.bancoGrafico;

import javafx.fxml.FXML;
import org.ucsal.poo.pf20252.br.Telas;

/**
 * Controlador para a tela principal de operações da conta.
 * Gerencia a navegação para as diferentes funcionalidades bancárias.
 *
 * @author Daniel
 * @version 1.0
 * @see GeraisController
 * @see Telas
 */
public class ContaController extends GeraisController{

    /**
     * Navega para a tela de saque configurada com a conta alvo atual.
     */
    @FXML
    protected void onSacarBtnClick(){
        MainApplication.changeScreen(Telas.SACAR, getContaAlvo());
    }

    /**
     * Navega para a tela de depósito configurada com a conta alvo atual.
     */
    @FXML
    protected void onDepositarBtnClick(){
        MainApplication.changeScreen(Telas.DEPOSITAR, getContaAlvo());
    }

    /**
     * Navega para a tela de transferência configurada com a conta alvo atual.
     */
    @FXML
    protected void onTransferirBtnClick(){
        MainApplication.changeScreen(Telas.TRANSFERIR, getContaAlvo());
    }

    /**
     * Navega para a tela de relatório configurada com a conta alvo atual.
     */
    @FXML
    protected void onRelatorioBtnClick(){
        MainApplication.changeScreen(Telas.RELATORIO, getContaAlvo());
    }
}