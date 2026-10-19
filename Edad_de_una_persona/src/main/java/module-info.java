module com.aliceur.edad_de_una_persona {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.aliceur.edad_de_una_persona to javafx.fxml;
    exports com.aliceur.edad_de_una_persona;
}
