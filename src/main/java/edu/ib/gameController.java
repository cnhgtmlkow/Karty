package edu.ib;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Shape;
import static edu.ib.Main.*;

public class gameController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private StackPane GamePane;

    @FXML
    private Button btnKartyOczekujace;

    @FXML
    private Button btnKartaAktywna;

    @FXML
    private ImageView kartaAktywna;

    @FXML
    private ImageView gracz;

    @FXML
    void kartaAktywna(ActionEvent event) {

    }

    @FXML
    void kartyOczekujace(ActionEvent event) {

    }

    @FXML
    void pictureOfCard(MouseEvent event) {

    }

    @FXML
    void initialize() {

        widokTylKarty.setFitHeight(80);
        widokTylKarty.setFitWidth(80);

        btnKartyOczekujace.setGraphic(widokTylKarty);
        btnKartaAktywna.setGraphic(widokTylKarty);

    }
}
