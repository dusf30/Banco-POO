package org.ucsal.poo.pf20252.br.bancoGrafico;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {
    @FXML
    protected Button segundaBtn;

    @FXML
    protected void onBtnClick(ActionEvent e){
        MainApplication.changeScreen("segunda");
    }
}
