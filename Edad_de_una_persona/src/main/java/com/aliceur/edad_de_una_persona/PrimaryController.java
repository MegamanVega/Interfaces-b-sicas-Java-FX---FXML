package com.aliceur.edad_de_una_persona;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    @FXML TextField tfFecha;
    @FXML Label lResultado;
    
    @FXML
    private void cEdad(){
        String Fecha=tfFecha.getText();
        
        String[] datos=Fecha.split("/");
        
        int dia=Integer.parseInt(datos[0]);
        int mes=Integer.parseInt(datos[1]);
        int anio=Integer.parseInt(datos[2]);
        
        int edad=2026-anio;
        int díasvd=18-dia;
        int mesesvd=10-mes;
        if(mesesvd<0||mesesvd==0&&díasvd<0){
            edad-=1;
            mesesvd+=12;
        }
        
        lResultado.setText("Tiene "+edad+" años con "+mesesvd+" meses");
    }
    
    @FXML
    private void Limpieza(){
        lResultado.setText("");
        tfFecha.setText("");
    }
}
