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
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXMLLoader;

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
    private TextField txtnumero1;
    @FXML
    private TextField txtnumero2;
    private TextField txtResultado;
    @FXML
    private TextField txtresult;

 
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

    @FXML
    private void abrirCadastroAluno(ActionEvent event){
try{
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
    Scene scene = new Scene(fxmlLoader.load(),900,682);
    Stage stage = new Stage();
    stage.setTitle("Cadastrar Aluno");
    stage.setScene(scene);
    stage.show();
}
catch(IOException e){

}
    }

    @FXML
    private void fecharProjeto(ActionEvent event) {
    }
    
}
