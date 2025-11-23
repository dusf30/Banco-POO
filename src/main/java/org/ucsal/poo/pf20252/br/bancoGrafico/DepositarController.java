package org.ucsal.poo.pf20252.br.bancoGrafico;


import javafx.fxml.FXML;
import org.ucsal.poo.pf20252.br.ValorInvalidoException;

public class DepositarController extends GeraisController{

    @FXML
    protected void depositarBtn(){
        try {
            String texto = getCampoInput().getText().trim().replace(",",".");
            getContaAlvo().depositar(Double.parseDouble(texto));
            mostrarSucesso("Deposito concluído");
        } catch (NumberFormatException e) {
            mostrarErro("Digite um número válido");
        } catch (ValorInvalidoException e){
            mostrarErro("Só é possível depositar valores maiores que 0,00.");
        } finally {
            getCampoInput().setText("");
        }
    }
}
