package org.ucsal.poo.pf20252.br.bancoGrafico;

import javafx.scene.control.Alert;
import org.ucsal.poo.pf20252.br.Conta;
import org.ucsal.poo.pf20252.br.Telas;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.ucsal.poo.pf20252.br.ValorInvalidoException;

public abstract class GeraisController  {
    private Conta contaAlvo;
    @FXML private Label saldoConta;
    @FXML private Button olhoButton;
    @FXML private TextField campoInput;


    @FXML
    public void initialize() {
        olhoButton.setOnAction(event -> contaAlvo.consultarSaldo(saldoConta));
    }

    @FXML
    public void voltarInicio() {
        esconderSaldo();
        MainApplication.changeScreen(Telas.INICIAL);
    }






    protected void mostrarSucesso(String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sucesso");
        alert.setContentText(mensagem);
        alert.show();
    }


    protected void mostrarErro(String mensagem) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERRO");
        alert.setContentText(mensagem);
        alert.show();
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
