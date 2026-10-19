module com.aliceur.cifras_y_divisores_de_un_numero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.aliceur.cifras_y_divisores_de_un_numero to javafx.fxml;
    exports com.aliceur.cifras_y_divisores_de_un_numero;
}
