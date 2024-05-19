/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import util.Thumb;

/**
 * FXML Controller class
 *
 * @author Lily
 */
public class MangaController implements Initializable {

    @FXML
    private ImageView searchIco;
    @FXML
    private TextField searchTXT;
    @FXML
    private AnchorPane leftPane;
    @FXML
    private AnchorPane rightPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        FlowPane flowPane = new FlowPane();
        AnchorPane.setBottomAnchor(flowPane, Double.valueOf(0));
        AnchorPane.setLeftAnchor(flowPane, Double.valueOf(0));
        AnchorPane.setRightAnchor(flowPane, Double.valueOf(0));
        AnchorPane.setTopAnchor(flowPane, Double.valueOf(0));
        Thumb mini = new Thumb(1,"One Piece", "SHONEN","2.png");
        Thumb mini2 = new Thumb(2,"Otro", "SEINEN","1.jpg");
        flowPane.getChildren().addAll(mini,mini2);
        flowPane.setPadding(new Insets(5));
        flowPane.setHgap(5);
        flowPane.setVgap(5);
        flowPane.setRowValignment(VPos.BOTTOM);
        leftPane.getChildren().add(flowPane);
    }

}
