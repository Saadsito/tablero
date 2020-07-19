package proyect;

import java.applet.AudioClip;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Proyect extends Application {
    
    private static String Nombre;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        stage.initStyle(StageStyle.UNDECORATED);        
        Scene scene = new Scene(root);
        AudioClip Musica;
        Musica = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sweden.wav"));
        Musica.play();
        stage.setScene(scene);
        stage.show();
    }

    public static String getNombre() {
        return Nombre;
    }

    public static void setNombre(String Nombre) {
        Proyect.Nombre = Nombre;
    }
    
    
    public static void main(String[] args) {
        String Nombre;
        launch(args);
    }
    
}
