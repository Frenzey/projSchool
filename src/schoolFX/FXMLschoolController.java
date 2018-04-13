/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolFX;

import Main.MetaData;
import Main.ProjSchool;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
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
    private JFXButton boutonEtud;
    @FXML
    private JFXButton prevBut;
    @FXML
    private HBox hboxMenu;
    @FXML
    private Pane RightPaneContainer;
    @FXML
    private Pane GereEtudC;
    @FXML
    private Pane GererPaie;
    @FXML
    private ToggleGroup money;
    @FXML
    private JFXButton prevButpaie;
    @FXML
    private JFXButton boutonPaie;
    @FXML
    private JFXButton boutonEnseig;
    @FXML
    private Pane GererEnseig;
    @FXML
    private JFXButton prevButEnseign;
    @FXML
    private ToggleGroup choice;
    @FXML
    private Pane GererInscrip;
    @FXML
    private JFXButton prevButInsc;
    @FXML
    private JFXButton boutonInscrip;
    @FXML
    private JFXButton prevButHSM;
    @FXML
    private JFXButton boutonHSM;
    @FXML
    private Pane GererHSM;
    @FXML
    private Pane GererAg;
    @FXML
    private JFXButton boutonAg;
    @FXML
    private JFXButton prevButAg;
    @FXML
    private JFXButton boutonGr;
    @FXML
    private Pane gererGroup;
    @FXML
    private JFXButton prevButGr;
    @FXML
    private JFXButton SignButton;

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
        GererPaie.toBack();
        GererEnseig.toBack();
        GereEtudC.toBack();
    }    

    @FXML
    private void handleaction(ActionEvent event) {
    LogContainer.toBack();
    AdminAccess.toFront();
    }
    
  

    @FXML
    private void goTostud(MouseEvent event) {
            manStud.toFront();
            GereEtudC.toFront();
            AdminAccess.toBack();
    }


    @FXML
    private void goToPaie(ActionEvent event) {
            manStud.toFront();
            GererPaie.toFront();
            AdminAccess.toBack();
    }

    @FXML
    private void goToEnseign(ActionEvent event) {
            manStud.toFront();
            GererEnseig.toFront();
            AdminAccess.toBack();
    
    }

    
    @FXML
    private void goBacktoAdmin(ActionEvent event) {
            manStud.toBack();
            AdminAccess.toFront();
    }

    @FXML
    private void goToIns(ActionEvent event) {
            manStud.toFront();
            GererInscrip.toFront();
            AdminAccess.toBack();
    }

    @FXML
    private void goToHSM(ActionEvent event) {
        
            manStud.toFront();
            GererHSM.toFront();
            AdminAccess.toBack();
    }

    @FXML
    private void goToAg(ActionEvent event) {
            manStud.toFront();
            GererAg.toFront();
            AdminAccess.toBack();
    }

    @FXML
    private void goToGr(ActionEvent event) {
            manStud.toFront();
            gererGroup.toFront();
            AdminAccess.toBack();
        
    }

    @FXML
    private void goToSignUp(ActionEvent event) throws IOException{
            
        //Body.getChildren().setAll(FXMLLoader.load("FXMLinscript.fxml"));
        
       //Body.getChildren().setAll(pane);
       
  }
    

}
            
