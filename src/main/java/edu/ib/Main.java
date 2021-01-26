package edu.ib;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {
    //byc moze to jest sposob, ja bym tak to zrobil, ale co kto lubi
    public static Image image = new Image("fxml/cards/aceofclubs.png");
    public static ImageView imageView = new ImageView(image);
    public static Image krolTrefl = new Image("fxml/cards/kingofclubs.png");
    public static ImageView widokKrolaTrefl = new ImageView(krolTrefl);
    public static Image damaTrefl = new Image("fxml/cards/queenofclubs.png");
    public static ImageView widokDamyTrefl = new ImageView(damaTrefl);

    public static void main(String[] args) {


        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/graph.fxml"));
        Scene scene = new Scene(root,800,500);
        stage.setScene(scene);
        stage.show();





    }
}
