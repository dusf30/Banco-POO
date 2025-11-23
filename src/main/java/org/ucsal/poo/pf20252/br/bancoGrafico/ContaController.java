package org.ucsal.poo.pf20252.br.bancoGrafico;

import javafx.fxml.FXML;
import org.ucsal.poo.pf20252.br.Telas;

public class ContaController extends GeraisController{

    @FXML
    protected void onSacarBtnClick(){
        MainApplication.changeScreen(Telas.SACAR, getContaAlvo());
    }


    @FXML
    protected void onDepositarBtnClick(){
        MainApplication.changeScreen(Telas.DEPOSITAR, getContaAlvo());
    }

    @FXML
    protected void onTransferirBtnClick(){
        MainApplication.changeScreen(Telas.TRANSFERIR, getContaAlvo());
    }


    @Override
    public void initialize() {
        super.initialize();
    }

}
