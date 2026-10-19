package com.aliceur.gastos_semanales;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML TextField txtAlimentacion,txtRefrigerios,txtTransporte,txtTelefonia,txtOtros,txtTotalSem,txtGastoAlto;
    
    @FXML
    private void calcular_gastos(){
        int alimentacion=Integer.parseInt(txtAlimentacion.getText());
        int refrigerios=Integer.parseInt(txtRefrigerios.getText());
        int transporte=Integer.parseInt(txtTransporte.getText());
        int telefonia=Integer.parseInt(txtTelefonia.getText());
        int otros=Integer.parseInt(txtOtros.getText());
        
        int totalSem=alimentacion+refrigerios+transporte+telefonia+otros;
        
        int mayor=alimentacion;
        String categoriaMayor="Alimentación";
        if (refrigerios > mayor) {
                mayor = refrigerios;
                categoriaMayor = "Refrigerios";
            }
            if (transporte > mayor) {
                mayor = transporte;
                categoriaMayor = "Transporte";
            }
            if (telefonia > mayor) {
                mayor = telefonia;
                categoriaMayor = "Telefonía";
            }
            if (otros > mayor) {
                mayor = otros;
                categoriaMayor = "Otros";
            }
            
        txtGastoAlto.setText(categoriaMayor);
        txtTotalSem.setText(totalSem+"");
        
    }
    @FXML
    private void limpiar(){
        txtAlimentacion.setText("");
        txtRefrigerios.setText("");
        txtTransporte.setText("");
        txtTelefonia.setText("");
        txtOtros.setText("");
        txtTotalSem.setText("");
        txtGastoAlto.setText("");
    }
}
