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
import javafx.scene.layout.HBox;
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
    @FXML
    private HBox hboxMenu;

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
    
  

    @FXML
    private void goTostud(MouseEvent event) {
            manStud.toFront();
            gererA.setStyle("-fx-background-color: #5a7589");
            AdminAccess.toBack();
    }

   @FXML
    private void goToAdminacc(ActionEvent event) {
    manStud.toBack();
    AdminAccess.toFront();
    }
    
}
            
