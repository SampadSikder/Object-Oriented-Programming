package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Login {
    @FXML
    TextField Username;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void loginButton(ActionEvent e)throws IOException{
        String username=Username.getText();
        FXMLLoader loader=new FXMLLoader(getClass().getResource("entered.fxml"));
        root=loader.load();

        EnteredClass obj=loader.getController();
        obj.displayName(username);

        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }
}
