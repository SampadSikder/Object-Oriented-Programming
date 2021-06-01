package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {

    @Override
    public void start(Stage stage) {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("mainpage.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);

            stage.show();

            stage.setOnCloseRequest(event->{
                event.consume();
                logout(stage);
            });

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void logout(Stage stage){
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to log out!");
        alert.setContentText("Do you want to save before logout?");

        if(alert.showAndWait().get()== ButtonType.OK) {

            //stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("Log out");
            stage.close();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}