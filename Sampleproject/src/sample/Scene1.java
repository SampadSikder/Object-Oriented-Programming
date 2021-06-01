package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1 {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    TextField username;
    TextField password;
    public void SignIn(ActionEvent event)throws IOException {

        String name = username.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        root = loader.load();

        Scene2 scene2 = loader.getController();
        scene2.displayName(name);


        Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }





}
