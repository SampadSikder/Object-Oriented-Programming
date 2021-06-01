package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class EnteredClass {
    @FXML
    Label nameLabel;
    @FXML
    private Button LogoutButton;
    @FXML
    private AnchorPane scenePane;
    @FXML
    ImageView RajuPic;
    @FXML
    Button ShowRaju;
    @FXML
    Button RajuBlur;

    Stage stage;
    Parent root;
    Scene scene;
    private String Username;

    public void displayName(String username){
        nameLabel.setText(username);
        this.Username=username;
    }

    public void logout(ActionEvent event){
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to log out!");
        alert.setContentText("Do you want to save before logout?");

        if(alert.showAndWait().get()== ButtonType.OK) {

            stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("Log out");
            stage.close();
        }
    }
    public void showRaju(ActionEvent e){
        Image im=new Image(getClass().getResourceAsStream("raju2.jpg"));
        RajuPic.setImage(im);
    }
    public void blurRaju(ActionEvent e){
        RajuPic.setOpacity(0.30);
    }
    public void Age(ActionEvent e)throws IOException {
        //String username=Username.getText();
        FXMLLoader loader=new FXMLLoader(getClass().getResource("Age.fxml"));
        root=loader.load();

        Age obj=loader.getController();
        obj.showUser(Username);

        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }
}
