module com.aliceur.calculadora {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.aliceur.calculadora to javafx.fxml;
    exports com.aliceur.calculadora;
}
