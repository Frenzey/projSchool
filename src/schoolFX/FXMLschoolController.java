/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolFX;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author frenzey
 */
public class FXMLschoolController implements Initializable {

    @FXML
    private JFXButton logButton;
    @FXML
    private JFXTextField username;
    @FXML
    private JFXPasswordField password;
    @FXML
    private AnchorPane Body;
    @FXML
    private AnchorPane LogContainer;
    @FXML
    private AnchorPane LogpPanel;
    @FXML
    private AnchorPane AdminAccess;
    @FXML
    private AnchorPane manStud;
    @FXML
    private Pane gererA;
    @FXML
    private Pane gererB;
    @FXML
    private Pane gererC;
    @FXML
    private Pane gererD;
    @FXML
    private Pane gererE;
    @FXML
    private Pane gererF;
    @FXML
    private Pane gererG;
    @FXML
    private Pane gererH;
    @FXML
    private Pane gererI;
    @FXML
    private JFXButton boutonEtud;
    @FXML
    private JFXButton prevBut;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //AdminAccess.setVisible(false);
        LogContainer.toFront();
        //this is a comment
        //on test à chaque fois
    }    

    @FXML
    private void handleaction(ActionEvent event) {
    LogContainer.toBack();
    AdminAccess.toFront();
    }
    
    //boutonEtud
    @FXML
    public void shiftOn(){
         gererA.setStyle("-fx-background-color: #5a7589");
         gererA.setCursor(Cursor.HAND);
    }
    
    @FXML
    public void shiftOff(){
         gererA.setStyle("-fx-background-color: #225066");
    }
    
    //boutonInscr
    @FXML
    public void shiftOn1(){
         gererB.setStyle("-fx-background-color: #5a7589");
         gererB.setCursor(Cursor.HAND);
    }
    
    @FXML
    public void shiftOff1(){
         gererB.setStyle("-fx-background-color: #225066");
    }
    
    //boutonPaie
    @FXML
    public void shiftOn2(){
         gererC.setStyle("-fx-background-color: #5a7589");
         gererC.setCursor(Cursor.HAND);
    }
    
    @FXML
    public void shiftOff2(){
         gererC.setStyle("-fx-background-color: #225066");
    }
    
    //BoutonEnseig
    @FXML
    public void shiftOn3(){
         gererD.setStyle("-fx-background-color: #5a7589");
         gererD.setCursor(Cursor.HAND);
    }
    
    @FXML
    public void shiftOff3(){
         gererD.setStyle("-fx-background-color: #225066");
    }
    
    //BoutonSall
    @FXML
    public void shiftOn4(){
         gererE.setStyle("-fx-background-color: #5a7589");
         gererE.setCursor(Cursor.HAND);
    }
    @FXML
    public void shiftOff4(){
         gererE.setStyle("-fx-background-color: #225066");
    }
    
    //boutonAg
    @FXML
    public void shiftOn5(){
         gererF.setStyle("-fx-background-color: #5a7589");
         gererF.setCursor(Cursor.HAND);
    } 
    @FXML
    public void shiftOff5(){
         gererF.setStyle("-fx-background-color: #225066");
    }
    
    //BoutonGroup
    @FXML
    public void shiftOn6(){
         gererG.setStyle("-fx-background-color: #5a7589");
         gererG.setCursor(Cursor.HAND);
    }
    
    @FXML
    public void shiftOff6(){
         gererG.setStyle("-fx-background-color: #225066");
    }
    
    //BoutonMatier
    @FXML
    public void shiftOn7(){
         gererH.setStyle("-fx-background-color: #5a7589");
         gererH.setCursor(Cursor.HAND);
    }
    
    @FXML
    public void shiftOff7(){
         gererH.setStyle("-fx-background-color: #225066");
    }
   
    //BoutonMatier
    @FXML
    public void shiftOn8(){
         gererI.setStyle("-fx-background-color: #5a7589");
         gererI.setCursor(Cursor.HAND);
    }
    
    @FXML
    public void shiftOff8(){
         gererI.setStyle("-fx-background-color: #225066");
    }

    @FXML
    private void goTostud(MouseEvent event) {
            manStud.toFront();
            gererA.setStyle("-fx-background-color: #5a7589");
            AdminAccess.toBack();
    }
    
}
            
