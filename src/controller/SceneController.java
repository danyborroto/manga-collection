/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Lily
 */
public class SceneController implements Initializable {

    @FXML
    private VBox leftMenu;
    @FXML
    private AnchorPane rightPane;
    @FXML
    private Button mangaBTN;
    @FXML
    private Button genereBTN;
    @FXML
    private Button authorBTN;
    @FXML
    private Button serieBTN;
    @FXML
    private Button settingBTN;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onMangaView(ActionEvent event) {
        try {
            changeFXML("/view/Manga.fxml");
        } catch (IOException ex) {
            Logger.getLogger(SceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void onGenreView(ActionEvent event) {
        try {
            changeFXML("/view/Genre.fxml");
        } catch (IOException ex) {
            Logger.getLogger(SceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void onAuthorView(ActionEvent event) {
        try {
            changeFXML("/view/Author.fxml");
        } catch (IOException ex) {
            Logger.getLogger(SceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void onSerieView(ActionEvent event) {
        try {
            changeFXML("/view/Serie.fxml");
        } catch (IOException ex) {
            Logger.getLogger(SceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void onSettingView(ActionEvent event) {
        try {
            changeFXML("/view/Setting.fxml");
        } catch (IOException ex) {
            Logger.getLogger(SceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    private void changeFXML(String fxml) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
        AnchorPane panel = loader.load();
        
        AnchorPane.setBottomAnchor(panel, Double.valueOf(0));
        AnchorPane.setLeftAnchor(panel, Double.valueOf(0));
        AnchorPane.setRightAnchor(panel, Double.valueOf(0));
        AnchorPane.setTopAnchor(panel, Double.valueOf(0));
        rightPane.getChildren().setAll(panel);
    }
}
