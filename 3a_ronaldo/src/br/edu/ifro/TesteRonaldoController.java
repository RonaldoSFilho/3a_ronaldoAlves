/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 03016487276
 */
public class TesteRonaldoController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Label lblnum1;
    @FXML
    private Label lblnum2;
    @FXML
    private Label lblresult;
    @FXML
    private Button soma;
    @FXML
    private Button subtracao;
    @FXML
    private TextField txtnumero1;
    @FXML
    private TextField txtnumero2;
    @FXML
    private TextField txtResultado;

 
    @FXML
    private void soma(ActionEvent event) {
       Double num1= Double.parseDouble(txtnumero1.getText());
       Double num2= Double.parseDouble(txtnumero2.getText());
       Double resultado= num1 + num2;
       txtResultado.setText(resultado.toString());
    }
     
    @FXML
    private void subtracao(ActionEvent event) {
       Double num1= Double.parseDouble(txtnumero1.getText());
       Double num2= Double.parseDouble(txtnumero2.getText());
       Double resultado= num1 - num2;
       txtResultado.setText(resultado.toString());
    }
     @FXML
    private void multiplicacao(ActionEvent event) {
       Double num1= Double.parseDouble(txtnumero1.getText());
       Double num2= Double.parseDouble(txtnumero2.getText());
       Double resultado= num1 * num2;
       txtResultado.setText(resultado.toString());
    }
      @FXML
    private void divisao(ActionEvent event) {
       Double num1= Double.parseDouble(txtnumero1.getText());
       Double num2= Double.parseDouble(txtnumero2.getText());
       Double resultado= num1 / num2;
       txtResultado.setText(resultado.toString());
    }
         
    @FXML
     public void Limpar (){
    txtnumero1.setText ("");
    txtnumero2.setText ("");
    txtResultado.setText ("");
}  

       
      
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
