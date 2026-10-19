module com.aliceur.gastos_semanales {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.aliceur.gastos_semanales to javafx.fxml;
    exports com.aliceur.gastos_semanales;
}
