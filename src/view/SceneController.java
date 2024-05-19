/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * FXML Controller class
 *
 * @author Lily
 */
public class SceneController implements Initializable {

    @FXML
    private Button newBTN;
    @FXML
    private Button openBTN;
    @FXML
    private VBox leftMenu;
    @FXML
    private Button mangaBTN;
    @FXML
    private Button tagBTN;
    @FXML
    private Button authorBTN;
    @FXML
    private Button serieBTN;
    @FXML
    private Button settingBTN;
    @FXML
    private AnchorPane rightPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onNewProject(ActionEvent event) {
    }

    @FXML
    private void onOpenProject(ActionEvent event) {
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
    private void onTagView(ActionEvent event) {
        try {
            changeFXML("/view/Tag.fxml");
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
            //changeFXML("/view/Setting.fxml");
            Stage modalStage = new Stage();
            modalStage.initModality(Modality.APPLICATION_MODAL);
            modalStage.initOwner(settingBTN.getScene().getWindow());
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Setting.fxml"));
            Parent root = loader.load();
            Scene modalScene = new Scene(root);
            modalStage.setScene(modalScene);

            // Mostrar ventana modal
            modalStage.showAndWait();
        } catch (IOException ex) {
            Logger.getLogger(SceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void changeFXML(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
        AnchorPane panel = loader.load();

        AnchorPane.setBottomAnchor(panel, Double.valueOf(0));
        AnchorPane.setLeftAnchor(panel, Double.valueOf(0));
        AnchorPane.setRightAnchor(panel, Double.valueOf(0));
        AnchorPane.setTopAnchor(panel, Double.valueOf(0));
        rightPane.getChildren().setAll(panel);
    }
}
