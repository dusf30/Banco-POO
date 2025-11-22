package org.ucsal.poo.pf20252.br.bancoGrafico;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import org.ucsal.poo.pf20252.br.Conta;

public class DepositarController extends GeraisController{

    @Override
    public void voltarInicio() {
        super.voltarInicio();
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public Conta getContaAlvo() {
        return super.getContaAlvo();
    }

    @FXML
    protected void depositarBtn(){
        try {
            String texto = getCampoInput().getText().trim().replace(",",".");
            getContaAlvo().depositar(Double.parseDouble(texto));
            mostrarSucesso("Deposito concluído");
        } catch (NumberFormatException e) {
            mostrarErro("Digite um número válido");
        } catch (IllegalArgumentException e){
            mostrarErro("Só é possível depositar valores maiores que 0,00.");
        } finally {
            getCampoInput().setText("");
        }
    }



    private void mostrarSucesso(String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sucesso");
        alert.setContentText(mensagem);
        alert.show();
    }


    private void mostrarErro(String mensagem) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERRO");
        alert.setContentText(mensagem);
        alert.show();
    }


}
