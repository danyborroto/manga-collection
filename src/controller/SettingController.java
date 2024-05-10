/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lily
 */
public class SettingController implements Initializable {

    @FXML
    private TextField readerTXT;
    @FXML
    private Button readerBTN;
    @FXML
    private ComboBox<?> viewTypeCombo;
    @FXML
    private ComboBox<?> contentCombo;
    @FXML
    private TextField numberItemsTXT;
    @FXML
    private TextField pathTXT;
    @FXML
    private ListView<?> pathList;
    @FXML
    private Button plusBTN;
    @FXML
    private Button minusBTN;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
