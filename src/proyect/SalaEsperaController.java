
package proyect;

import java.applet.AudioClip;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class SalaEsperaController implements Initializable{

    @FXML
     Label nombre1;
    @FXML
    private Label nombre2;
    @FXML
    private Label nombre3;
    @FXML
    private Label nombre4;
    @FXML
    private Label nombre5;
    @FXML
    private Label nombre6;
    @FXML
    private ImageView vegetta1;
    @FXML
    private ImageView vegetta2;
    @FXML
    private ImageView lolito1;
    @FXML
    private ImageView lolito2;
    @FXML
    private ImageView rubius1;
    @FXML
    private ImageView rubius2;
    @FXML
    private ImageView auron1;
    @FXML
    private ImageView auron2;
    @FXML
    private ImageView willyrex1;
    @FXML
    private ImageView willyrex2;
    @FXML
    private ImageView luzu1;
    @FXML
    private ImageView luzu2;
    @FXML
    private ImageView equis1;
    @FXML
    private ImageView chulito1;
    @FXML
    private ImageView equis2;
    @FXML
    private ImageView equis3;
    @FXML
    private ImageView equis6;
    @FXML
    private ImageView equis5;
    @FXML
    private ImageView equis4;
    @FXML
    private ImageView chulito2;
    @FXML
    private ImageView chulito3;
    @FXML
    private ImageView chulito4;
    @FXML
    private ImageView chulito5;
    @FXML
    private ImageView chulito6;

    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        
        vegetta2.setVisible(false);
        lolito2.setVisible(false);
        rubius2.setVisible(false);
        auron2.setVisible(false);
        willyrex2.setVisible(false);
        luzu2.setVisible(false);
        
        if("".equals(nombre1.getText())){
          nombre1.setText(Proyect.getNombre());
          numjugador=1;
          equis1.setVisible(true);
        }else if("".equals(nombre2.getText())){
          nombre2.setText(Proyect.getNombre());
          numjugador=2;
          equis2.setVisible(true);
        }else if("".equals(nombre3.getText())){
          nombre3.setText(Proyect.getNombre());
          numjugador=3;
          equis3.setVisible(true);
        }else if("".equals(nombre4.getText())){
          nombre4.setText(Proyect.getNombre());
          numjugador=4;
          equis4.setVisible(true);
        }else if("".equals(nombre5.getText())){
          nombre5.setText(Proyect.getNombre());
          numjugador=5;
          equis5.setVisible(true);
        }else if("".equals(nombre6.getText())){
          nombre6.setText(Proyect.getNombre());
          numjugador=6;
          equis6.setVisible(true);
        }
    }    

    boolean fijado=false;
    int numjugador;
    AudioClip SonidoPersonaje;
    
    @FXML
    private void vegetta1abajo(MouseEvent event) {
        if(!fijado){
            vegetta1.setVisible(true);
            vegetta2.setVisible(false);
        }
    }

    @FXML
    private void vegetta1arriba(MouseEvent event) {
        if(!fijado){
            vegetta2.setVisible(true);
            vegetta1.setVisible(false);
        }
    }

    @FXML
    private void vegetta2abajo(MouseEvent event) {
        if(!fijado){
            vegetta1.setVisible(true);
            vegetta2.setVisible(false);
        }
    }

    @FXML
    private void vegetta2arriba(MouseEvent event) {
        if(!fijado){
            vegetta2.setVisible(true);
            vegetta1.setVisible(false);
        }
    }

    @FXML
    private void vegetta2click(MouseEvent event) {
            fijado=true;
            if (numjugador==1){
              equis1.setVisible(false);
              chulito1.setVisible(true);
            }else if(numjugador==2){
              equis2.setVisible(false);
              chulito2.setVisible(true);    
            }else if(numjugador==3){
              equis3.setVisible(false);
              chulito3.setVisible(true);
            }else if(numjugador==4){
              equis4.setVisible(false);
              chulito4.setVisible(true);
            }else if(numjugador==5){
              equis5.setVisible(false);
              chulito5.setVisible(true);
            }else if(numjugador==6){
              equis6.setVisible(false);
              chulito6.setVisible(true);
            }
            SonidoPersonaje = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/vegetta777.wav"));
            SonidoPersonaje.play();
            lolito1.setVisible(false);
            rubius1.setVisible(false);
            auron1.setVisible(false);
            willyrex1.setVisible(false);
            luzu1.setVisible(false);       
    }

    @FXML
    private void lolito1abajo(MouseEvent event) {
        if(!fijado){
            lolito1.setVisible(true);
            lolito2.setVisible(false);
        }
    }

    @FXML
    private void lolito1arriba(MouseEvent event) {
        if(!fijado){
            lolito2.setVisible(true);
            lolito1.setVisible(false);
        }
    }

    @FXML
    private void lolito2abajo(MouseEvent event) {
        if(!fijado){
            lolito1.setVisible(true);
            lolito2.setVisible(false);
        }
    }

    @FXML
    private void lolito2arriba(MouseEvent event) {
        if(!fijado){
            lolito2.setVisible(true);
            lolito1.setVisible(false);
        }
    }

    @FXML
    private void lolito2click(MouseEvent event) {
            fijado=true;
            if (numjugador==1){
              equis1.setVisible(false);
              chulito1.setVisible(true);
            }else if(numjugador==2){
              equis2.setVisible(false);
              chulito2.setVisible(true);    
            }else if(numjugador==3){
              equis3.setVisible(false);
              chulito3.setVisible(true);
            }else if(numjugador==4){
              equis4.setVisible(false);
              chulito4.setVisible(true);
            }else if(numjugador==5){
              equis5.setVisible(false);
              chulito5.setVisible(true);
            }else if(numjugador==6){
              equis6.setVisible(false);
              chulito6.setVisible(true);
            }
            SonidoPersonaje = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/lolito.wav"));
            SonidoPersonaje.play();
            vegetta1.setVisible(false);
            rubius1.setVisible(false);
            auron1.setVisible(false);
            willyrex1.setVisible(false);
            luzu1.setVisible(false);   
    }

    @FXML
    private void rubius1abajo(MouseEvent event) {
        if(!fijado){
            rubius1.setVisible(true);
            rubius2.setVisible(false);
        }
    }

    @FXML
    private void rubius1arriba(MouseEvent event) {
        if(!fijado){
            rubius2.setVisible(true);
            rubius1.setVisible(false);
        }
    }

    @FXML
    private void rubius2abajo(MouseEvent event) {
        if(!fijado){
            rubius1.setVisible(true);
            rubius2.setVisible(false);
        }
    }

    @FXML
    private void rubius2arriba(MouseEvent event) {
        if(!fijado){
            rubius2.setVisible(true);
            rubius1.setVisible(false);
        }
    }

    @FXML
    private void rubius2click(MouseEvent event) {
        fijado=true;
        if (numjugador==1){
              equis1.setVisible(false);
              chulito1.setVisible(true);
            }else if(numjugador==2){
              equis2.setVisible(false);
              chulito2.setVisible(true);    
            }else if(numjugador==3){
              equis3.setVisible(false);
              chulito3.setVisible(true);
            }else if(numjugador==4){
              equis4.setVisible(false);
              chulito4.setVisible(true);
            }else if(numjugador==5){
              equis5.setVisible(false);
              chulito5.setVisible(true);
            }else if(numjugador==6){
              equis6.setVisible(false);
              chulito6.setVisible(true);
            }
            SonidoPersonaje = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/rubius.wav"));
            SonidoPersonaje.play();
            lolito1.setVisible(false);
            vegetta1.setVisible(false);
            auron1.setVisible(false);
            willyrex1.setVisible(false);
            luzu1.setVisible(false);   
    }

    @FXML
    private void auron1abajo(MouseEvent event) {
        if(!fijado){
            auron1.setVisible(true);
            auron2.setVisible(false);
        }
    }

    @FXML
    private void auron1arriba(MouseEvent event) {
        if(!fijado){
            auron2.setVisible(true);
            auron1.setVisible(false);
        }
    }

    @FXML
    private void auron2abajo(MouseEvent event) {
        if(!fijado){
            auron1.setVisible(true);
            auron2.setVisible(false);
        }
    }

    @FXML
    private void auron2arriba(MouseEvent event) {
        if(!fijado){
            auron2.setVisible(true);
            auron1.setVisible(false);
        }
    }

    @FXML
    private void auron2click(MouseEvent event) {
        fijado=true;
        if (numjugador==1){
              equis1.setVisible(false);
              chulito1.setVisible(true);
            }else if(numjugador==2){
              equis2.setVisible(false);
              chulito2.setVisible(true);    
            }else if(numjugador==3){
              equis3.setVisible(false);
              chulito3.setVisible(true);
            }else if(numjugador==4){
              equis4.setVisible(false);
              chulito4.setVisible(true);
            }else if(numjugador==5){
              equis5.setVisible(false);
              chulito5.setVisible(true);
            }else if(numjugador==6){
              equis6.setVisible(false);
              chulito6.setVisible(true);
            }
            SonidoPersonaje = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/auronplay.wav"));
            SonidoPersonaje.play();
            lolito1.setVisible(false);
            rubius1.setVisible(false);
            vegetta1.setVisible(false);
            willyrex1.setVisible(false);
            luzu1.setVisible(false);   
    }

    @FXML
    private void willyrex1abajo(MouseEvent event) {
        if(!fijado){
            willyrex1.setVisible(true);
            willyrex2.setVisible(false);
        }
    }

    @FXML
    private void willyrex1arriba(MouseEvent event) {
        if(!fijado){
            willyrex2.setVisible(true);
            willyrex1.setVisible(false);
        }
    }

    @FXML
    private void willyrex2abajo(MouseEvent event) {
        if(!fijado){
            willyrex1.setVisible(true);
            willyrex2.setVisible(false);
        }
    }

    @FXML
    private void willyrex2click(MouseEvent event) {
        fijado=true;
        if (numjugador==1){
              equis1.setVisible(false);
              chulito1.setVisible(true);
            }else if(numjugador==2){
              equis2.setVisible(false);
              chulito2.setVisible(true);    
            }else if(numjugador==3){
              equis3.setVisible(false);
              chulito3.setVisible(true);
            }else if(numjugador==4){
              equis4.setVisible(false);
              chulito4.setVisible(true);
            }else if(numjugador==5){
              equis5.setVisible(false);
              chulito5.setVisible(true);
            }else if(numjugador==6){
              equis6.setVisible(false);
              chulito6.setVisible(true);
            }
            SonidoPersonaje = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/willyrex.wav"));
            SonidoPersonaje.play();
            lolito1.setVisible(false);
            rubius1.setVisible(false);
            auron1.setVisible(false);
            vegetta1.setVisible(false);
            luzu1.setVisible(false);   
    }

    @FXML
    private void luzu1abajo(MouseEvent event) {   
        if(!fijado){
            luzu1.setVisible(true);
            luzu2.setVisible(false);
        }
    }

    @FXML
    private void luzu1arriba(MouseEvent event) {
        if(!fijado){
            luzu2.setVisible(true);
            luzu1.setVisible(false);
        }
    }

    @FXML
    private void luzu2abajo(MouseEvent event) {
        if(!fijado){
            luzu1.setVisible(true);
            luzu2.setVisible(false);
        }
    }

    @FXML
    private void luzu2click(MouseEvent event) {
        fijado=true;
        if (numjugador==1){
              equis1.setVisible(false);
              chulito1.setVisible(true);
            }else if(numjugador==2){
              equis2.setVisible(false);
              chulito2.setVisible(true);    
            }else if(numjugador==3){
              equis3.setVisible(false);
              chulito3.setVisible(true);
            }else if(numjugador==4){
              equis4.setVisible(false);
              chulito4.setVisible(true);
            }else if(numjugador==5){
              equis5.setVisible(false);
              chulito5.setVisible(true);
            }else if(numjugador==6){
              equis6.setVisible(false);
              chulito6.setVisible(true);
            }
            SonidoPersonaje = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/luzu.wav"));
            SonidoPersonaje.play();
            lolito1.setVisible(false);
            rubius1.setVisible(false);
            auron1.setVisible(false);
            willyrex1.setVisible(false);
            vegetta1.setVisible(false);   
    }

    @FXML
    private void willyrex2arriba(MouseEvent event) {
        if(!fijado){
            willyrex2.setVisible(true);
            willyrex1.setVisible(false);
        }
    }

    @FXML
    private void luzu2arriba(MouseEvent event) {
        if(!fijado){
            luzu2.setVisible(true);
            luzu1.setVisible(false);
        }
    }
    
    
}
