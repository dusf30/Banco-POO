package org.ucsal.poo.pf20252.br.bancoGrafico;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.ucsal.poo.pf20252.br.Conta;
import org.ucsal.poo.pf20252.br.ContaCorrente;
import org.ucsal.poo.pf20252.br.ContaPoupanca;
import org.ucsal.poo.pf20252.br.Telas;

import java.io.IOException;

public class MainApplication extends Application {
    private static Stage stage;

    private static Scene telaInicial;
    private static Scene conta;
    private static Scene sacar;
    private static Scene depositar;
    private static Scene transferir;

    private static ContaController contaController;
    private static SacarController sacarController;
    private static DepositarController depositarController;
    private static TransferirController transferirController;


    private static Conta contaCorrente = new ContaCorrente(123,10000);
    private static Conta contaPoupanca = new ContaPoupanca(456,16.45);


    @Override
    public void start(Stage stageInicial) throws IOException {
        Image icon = new Image(getClass().getResourceAsStream("images/logo-icon.png"));
        stage = stageInicial;
        stage.getIcons().add(icon);

        FXMLLoader loaderMain = new FXMLLoader(MainApplication.class.getResource("TelaInicial.fxml"));
        Parent fxmlMain = loaderMain.load();
        telaInicial = new Scene(fxmlMain);

        FXMLLoader loaderConta = new FXMLLoader(MainApplication.class.getResource("TelaConta.fxml"));
        Parent fxmlConta = loaderConta.load();
        contaController = loaderConta.getController();
        conta = new Scene(fxmlConta);


        FXMLLoader loaderSacar = new FXMLLoader(MainApplication.class.getResource("TelaSacar.fxml"));
        Parent fxmlSacar = loaderSacar.load();
        sacarController = loaderSacar.getController();
        sacar = new Scene(fxmlSacar);

        FXMLLoader loaderDepositar = new FXMLLoader(MainApplication.class.getResource("TelaDepositar.fxml"));
        Parent fxmlDepositar = loaderDepositar.load();
        depositarController = loaderDepositar.getController();
        depositar = new Scene(fxmlDepositar);

        FXMLLoader loaderTransferir = new FXMLLoader(MainApplication.class.getResource("TelaTransferir.fxml"));
        Parent fxmlTransferir = loaderTransferir.load();
        transferirController = loaderTransferir.getController();
        transferir = new Scene(fxmlTransferir);


        stageInicial.setTitle("JavaBank");
        stageInicial.setScene(telaInicial);
        stageInicial.show();
    }

    public static void changeScreen(Telas tela){
        switch (tela){
            case INICIAL -> stage.setScene(telaInicial);
            case CONTA -> stage.setScene(conta);
            case SACAR -> stage.setScene(sacar);
            case DEPOSITAR -> stage.setScene(depositar);
            case TRANSFERIR -> stage.setScene(transferir);

            default -> System.err.println("Tela inesistente");
        }
    }

    public static void changeScreen(Telas tela, Conta contaAlvo) {
        switch (tela) {
            case CONTA -> {
                contaController.setContaAlvo(contaAlvo);
                stage.setScene(conta);
            }
            case SACAR -> {
                sacarController.setContaAlvo(contaAlvo);
                stage.setScene(sacar);
            }
            case DEPOSITAR -> {
                depositarController.setContaAlvo(contaAlvo);
                stage.setScene(depositar);
            }
            case TRANSFERIR -> {
                transferirController.setContaAlvo(contaAlvo);
                stage.setScene(transferir);
            }
            default -> System.err.println("Tela inexistente");
        }
    }



    public static Conta getContaCorrente() {
        return contaCorrente;
    }

    public static Conta getContaPoupanca() {
        return contaPoupanca;
    }

    public static void main(String[] args) {
        launch();
    }
}