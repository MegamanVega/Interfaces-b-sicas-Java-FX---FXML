package com.aliceur.calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML TextField txtEntrada;
    @FXML TextArea txtTabla;
    @FXML
    private void Calcular(){
        int num=Integer.parseInt(txtEntrada.getText());
        String res="";
        int mult=0;
       for(int i=1;i<=10;i++){
           mult=num*i;
           
           res +="5x"+i+" = "+mult+"\n";
       }
       txtTabla.setText(res);
    }
    @FXML
    private void Limpiar(){
        txtEntrada.setText("");
        txtTabla.setText("");
    }
}
