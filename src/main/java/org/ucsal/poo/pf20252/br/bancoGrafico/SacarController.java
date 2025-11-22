package org.ucsal.poo.pf20252.br.bancoGrafico;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SacarController extends GeraisController{

    @FXML
    private Label boasVindasUser;


    private void atualizarTela() {
        String nome = "NOME";
        boasVindasUser.setText("Olá " + nome + ",Saque já");
    }



    @Override
    public void initialize() {
        super.initialize();
    }
}