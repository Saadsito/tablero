/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.applet.AudioClip;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
/**
 *
 * @author PC
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private JFXTextField nombre;
    @FXML
    private ImageView jugar1;
    @FXML
    private ImageView jugar2;
    @FXML
    private ImageView salir1;
    @FXML
    private ImageView salir2;
    
    AudioClip SonidoBot;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      nombre.setStyle("-fx-text-inner-color: white;");
    }    

    @FXML
    private void jugar1abajo(MouseEvent event) {
        jugar1.setVisible(true);
        jugar2.setVisible(false);
    }

    @FXML
    private void jugar1arriba(MouseEvent event) {
        jugar1.setVisible(false);
        jugar2.setVisible(true);
    }

    @FXML
    private void jugar2abajo(MouseEvent event) {
        jugar1.setVisible(true);
        jugar2.setVisible(false);        
    }

    @FXML
    private void jugar2arriba(MouseEvent event) {
        jugar1.setVisible(false);
        jugar2.setVisible(true); 
    }

    @FXML
    private void salir1abajo(MouseEvent event) {
        salir1.setVisible(true);
        salir2.setVisible(false);        
    }

    @FXML
    private void salir1arriba(MouseEvent event) {
        salir1.setVisible(false);
        salir2.setVisible(true);  
    }

    @FXML
    private void salir2abajo(MouseEvent event) {
        salir1.setVisible(true);
        salir2.setVisible(false);            
    }

    @FXML
    private void salir2arriba(MouseEvent event) {
        salir1.setVisible(false);
        salir2.setVisible(true);   
    }

    @FXML
    private void jugarClick(MouseEvent event)throws IOException{
        SonidoBot = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sonidoboton.wav"));
        SonidoBot.play();
        if("".equals(nombre.getText())){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Se ha producido un error");
            alert.setContentText("No puede ingresar sin haber colocado un nombre.");
            alert.showAndWait();
        }
        else{
            Proyect.setNombre(nombre.getText());          

            Parent SaladeEspera = FXMLLoader.load(getClass().getResource("SalaEspera.fxml"));
            Scene PantSalaEspera = new Scene(SaladeEspera);
            Stage ventana = (Stage)((Node)event.getSource()).getScene().getWindow();
            ventana.setScene(PantSalaEspera);
            ventana.show();
            
        }
    }

    @FXML
    private void salirClick(MouseEvent event) throws IOException {
        SonidoBot = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sonidoboton.wav"));
        SonidoBot.play();
        Platform.exit();
        System.exit(0);
    }
}