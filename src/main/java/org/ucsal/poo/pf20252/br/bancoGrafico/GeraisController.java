package org.ucsal.poo.pf20252.br.bancoGrafico;

import org.ucsal.poo.pf20252.br.Conta;
import org.ucsal.poo.pf20252.br.Operavel;
import org.ucsal.poo.pf20252.br.Telas;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public abstract class GeraisController implements Operavel {

    private Conta contaAlvo;

    private boolean saldoVisivel = false;

    @FXML private Label saldoConta;

    @FXML private Button olhoButton;

    @FXML private TextField campoInput;


    @FXML
    public void initialize() {
        olhoButton.setOnAction(event -> consultarSaldo());
    }

    @FXML
    public void voltarInicio() {
        esconderSaldo();
        MainApplication.changeScreen(Telas.INICIAL);
    }


	@Override
	public void transferir(double valor, Conta destino) {
		
	}

    @Override
    public void consultarSaldo() {
        saldoVisivel = !saldoVisivel;

        if (saldoVisivel) {
            saldoConta.setText(String.format("%.2f", contaAlvo.getSaldo()));
        } else {
            esconderSaldo();
        }
    }

    private void esconderSaldo() {
        saldoConta.setText("*****");
    }


    public void setContaAlvo(Conta contaAlvo) {
        this.contaAlvo = contaAlvo;
    }

    public Conta getContaAlvo() {
        return contaAlvo;
    }

    public TextField getCampoInput() {
        return campoInput;
    }
}
