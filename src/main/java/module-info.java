module org.ucsal.poo.pf20252.br.bancoGrafico {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.ucsal.poo.pf20252.br.bancoGrafico to javafx.fxml;
    exports org.ucsal.poo.pf20252.br.bancoGrafico;
    exports org.ucsal.poo.pf20252.br;
    opens org.ucsal.poo.pf20252.br to javafx.fxml;
}