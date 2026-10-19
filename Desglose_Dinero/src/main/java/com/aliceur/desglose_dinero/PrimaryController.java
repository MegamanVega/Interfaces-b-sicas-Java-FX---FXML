package com.aliceur.desglose_dinero;


import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML TextField txtCantidad ;
    @FXML TextArea txaResultados;
    
    @FXML
    private void Hacer_Desglose() {
        
        String entrada=txtCantidad.getText();
        int cantidad=Integer.parseInt(entrada);
        //Vamo a crear todas las benditas denominaciones
        int b500=0, b200=0,b100=0,b50=0,b20=0,m10=0,m5=0,m2=0,m1=0;
                
                
        while(cantidad>=500){
            b500++;
            cantidad-=500;
        }while (cantidad>=200)
       {
            b200++;
            cantidad-=200;
        }
        while (cantidad>=100){
            b100++;
            cantidad-=100;
        }
        while(cantidad>=50){
            b50++;
            cantidad-=50;
        }
        while(cantidad>=20){
            b20++;
            cantidad-=20;
        }
        while(cantidad>=10){
            m10++;
            cantidad-=10;
        }
        while(cantidad>=5){
            m5++;
            cantidad-=5;
        }
        while(cantidad>=2){
            m2++;
            cantidad-=2;
        }
        while(cantidad>=1){
            m1++;
            cantidad-=1;
        }
        
        txaResultados.setText(
                b500+"\n"+
                b200+"\n"+
                b100+"\n"+
                b50+"\n"+
                b20+"\n"+
                m10+"\n"+
                m5+"\n"+
                m2+"\n"+
                m1+"\n"
                        
        );
    }
    @FXML
    private void limpiar(){
        txtCantidad.setText("");
        txaResultados.setText("");
    }
}
