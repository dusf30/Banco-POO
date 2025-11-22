package org.ucsal.poo.pf20252.br.bancoGrafico;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.ucsal.poo.pf20252.br.Conta;
import org.ucsal.poo.pf20252.br.Telas;

public abstract class GeraisController {

    private Conta contaAlvo;

    private boolean saldoVisivel = false;

    @FXML private Label saldoConta;

    @FXML private Button olhoButton;




    @FXML
    public void initialize() {
        olhoButton.setOnAction(event -> consultarSaldo());
    }

    @FXML
    public void voltarInicio() {
        MainApplication.changeScreen(Telas.INICIAL);
    }




    private void consultarSaldo() {
        saldoVisivel = !saldoVisivel;

        if (saldoVisivel) {
            saldoConta.setText(String.format("%.2f", contaAlvo.getSaldo()));
        } else {
            saldoConta.setText("*****");
        }
    }


    public void setContaAlvo(Conta contaAlvo) {
        this.contaAlvo = contaAlvo;
    }

    public Conta getContaAlvo() {
        return contaAlvo;
    }
}
