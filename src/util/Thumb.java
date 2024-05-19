/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author Lily
 */
public class Thumb extends Button {

    private int id;
    private String title;
    private boolean isSelected;
    private String demografia;
    private String image;

    private StackPane contenedor;
    private ImageView imagen;
    private VBox vbox;
    private AnchorPane anchorPane1;
    private AnchorPane anchorPane2;
    private AnchorPane anchorPane3;
    private Label titleLabel;
    private Label demografiaLabel;
    private CheckBox checkBtn;

    public Thumb(int id, String title, String demografia, String imgFile) {
        this.id = id;
        this.title = title;
        this.demografia = demografia;

        this.getStylesheets().add("/util/thumb-style.css");
        prepareImg(imgFile);
        prepareCotent();
        this.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        ocultarCheck(false);
        this.setStyle("-fx-background-color:transparent; -fx-border-width:2px;-fx-border-color:yellow;-fx-padding:0");
    }

    private void prepareImg(String file) {
        imagen = new ImageView();
        Image img = new Image("file:///C:/Users/Lily/Documents/NetBeansProjects/ComicCollection/" + file,
                250, 250, true, true);
        imagen.setImage(img);
    }

    private void prepareCotent() {
        this.titleLabel = new Label(this.title);
        titleLabel.setTextAlignment(TextAlignment.CENTER);
        titleLabel.setPadding(new Insets(0,0,0,30));
        this.titleLabel.setStyle("-fx-text-fill:#fff;"); // Centra el texto horizontalmente
        this.titleLabel.setContentDisplay(ContentDisplay.LEFT);
        this.demografiaLabel = new Label(this.demografia);
        this.demografiaLabel.setStyle("-fx-text-fill:#fff;"); // Centra el texto horizontalmente
        this.demografiaLabel.setContentDisplay(ContentDisplay.CENTER);
        demografiaLabel.setAlignment(Pos.CENTER);
        demografiaLabel.setTextAlignment(TextAlignment.CENTER);
        
        anchorPane1 = new AnchorPane();
        anchorPane1.getChildren().add(titleLabel);
        anchorPane1.setStyle("-fx-background-color:rgba(0,0,0,0.8)");
        anchorPane1.setPrefHeight(Double.valueOf(39));
        anchorPane2 = new AnchorPane();
        anchorPane3 = new AnchorPane();
        anchorPane3.getChildren().add(demografiaLabel);
        anchorPane3.setStyle("-fx-background-color:rgba(0,0,0,0.8)");
        anchorPane3.setPrefHeight(Double.valueOf(39));

        AnchorPane.setBottomAnchor(titleLabel, Double.valueOf(0));
        AnchorPane.setLeftAnchor(titleLabel, Double.valueOf(0));
        AnchorPane.setRightAnchor(titleLabel, Double.valueOf(0));
        AnchorPane.setTopAnchor(titleLabel, Double.valueOf(0));

        AnchorPane.setBottomAnchor(demografiaLabel, Double.valueOf(0));
        AnchorPane.setLeftAnchor(demografiaLabel, Double.valueOf(0));
        AnchorPane.setRightAnchor(demografiaLabel, Double.valueOf(0));
        AnchorPane.setTopAnchor(demografiaLabel, Double.valueOf(0));
        vbox = new VBox();
        vbox.getChildren().addAll(anchorPane1, anchorPane2, anchorPane3);
        VBox.setVgrow(anchorPane2, Priority.ALWAYS);
        checkBtn = new CheckBox();
        contenedor = new StackPane();
        contenedor.getChildren().addAll(imagen, vbox, checkBtn);

        StackPane.setAlignment(checkBtn, Pos.TOP_LEFT);
        StackPane.setMargin(checkBtn, new Insets(5));
        checkBtn.setStyle("-fx-text-fill: blue; -fx-effect: dropshadow(gaussian, rgba(0,0,0,0.5), 5, 0, 0, 1);");

        
        this.setGraphic(contenedor);
    }


    public void ocultarCheck(boolean hidden) {
        checkBtn.setVisible(!hidden);
    }

}
