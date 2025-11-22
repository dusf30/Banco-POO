package org.ucsal.poo.pf20252.br.bancoGrafico;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.ucsal.poo.pf20252.br.ContaCorrente;
import org.ucsal.poo.pf20252.br.Telas;

public class InicioController {
    @FXML
    protected Button btnCorrente;

    @FXML
    protected Button btnPoupanca;

    @FXML
    protected void onContaCorrenteClick(ActionEvent event) {
        MainApplication.changeScreen(Telas.CONTA, MainApplication.getContaCorrente());

    }

    @FXML
    protected void onContaPoupancaClick(ActionEvent event) {
        MainApplication.changeScreen(Telas.CONTA, MainApplication.getContaPoupanca());
    }


}
