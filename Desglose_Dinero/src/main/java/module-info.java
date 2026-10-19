module com.aliceur.desglose_dinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.aliceur.desglose_dinero to javafx.fxml;
    exports com.aliceur.desglose_dinero;
}
