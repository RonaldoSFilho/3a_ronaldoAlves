package br.edu.ifro;

import br.edu.ifro.modelo.aluno;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class AlunoController implements Initializable {

    @FXML
private TextField txtNome;
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void salvar(ActionEvent event){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
        aluno aluno1 = new aluno();
        aluno1.setNome(txtNome.getText());
        
        em.persist(aluno1);
        em.getTransaction().begin();
    }
    @FXML
    private void fechar(ActionEvent event){
   Stage stage = (Stage) txtNome.getScene().getWindow();
   stage.close();
    
    }
}