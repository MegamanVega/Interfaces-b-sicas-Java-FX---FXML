package com.aliceur.cifras_y_divisores_de_un_numero;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    @FXML TextField txtEntrada, txtcCifras, txtsImpares, txtsPares, txtsTCIFRAS, txtCMAYOR, txtCMENOR;
    @FXML TextArea txtDivisores;
    @FXML
    private void Analisis(){
        String entrada=txtEntrada.getText();
        int numeros=Integer.parseInt(entrada);
        int numCifras=0;
        int impares=0;
        int pares=0;
        int sumaTotal=0;
        int sacrificio=numeros;
        int mayor=0;
        int menor=9;
        
        //Para las cifras, lo comento porque si no me revuelvo
        if (numeros==0){
            numCifras=0;
        }else{
            int n=numeros;
            while(n>0){
                n=n/10;
                numCifras++;
            }
        }
        
        //Suma de cifras impares y total a ver si puedo psdt:Si pude wii!! y tambien pude con el mayor y menor
        while(sacrificio>0){
            int numActual=sacrificio%10;
            
            if(numActual>mayor){
                mayor=numActual;
            }
                
            if(numActual<menor){
                menor=numActual;
            }
            
            if(numActual%2 != 0){
                impares+=numActual;
            }else{
                pares+=numActual;
            }
            sumaTotal+=numActual;
            
            sacrificio=sacrificio/10;
        }
        
        //Divisores
        String resultadoDivisores="";
        for(int i= 1;i<=numeros;i++){
            if(numeros%i==0){
                resultadoDivisores+=i+"\n";
            }
        }
        
        //Parte de los prints
        
        txtcCifras.setText(numCifras+"");
        txtsImpares.setText(impares+"");
        txtsPares.setText(pares+"");
        txtsTCIFRAS.setText(sumaTotal+"");
        txtCMAYOR.setText(mayor+"");
        txtCMENOR.setText(menor+"");
        txtDivisores.setText(resultadoDivisores);       
    }
   
    @FXML
    private void Limpieza(){
        txtEntrada.setText("");
        txtcCifras.setText("");
        txtsImpares.setText("");
        txtsPares.setText("");
        txtsTCIFRAS.setText("");
        txtCMAYOR.setText("");
        txtCMENOR.setText("");
        txtDivisores.setText("");        
    }
}
