/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author frenzey
 */
public class ProjSchool extends Application {

    public static Stage stage = null;

    /**
     * @param args the command line arguments
     * 
     */
    
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../schoolFX/FXMLschool.fxml"));
        
        Scene scene = new Scene(root);
        
        scene.getStylesheets().add(ProjSchool.class.getResource("../Css/style.css").toExternalForm());
        
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
        this.stage = stage;
        
        MetaData.parent = root;
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
                launch(args);

    }
    
}
