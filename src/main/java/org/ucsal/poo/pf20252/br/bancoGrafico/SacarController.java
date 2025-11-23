package org.ucsal.poo.pf20252.br.bancoGrafico;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.ucsal.poo.pf20252.br.Conta;
import org.ucsal.poo.pf20252.br.ValorInvalidoException;

public class SacarController extends GeraisController{

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