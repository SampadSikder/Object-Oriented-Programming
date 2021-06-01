package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Age {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    AnchorPane AgeAnchor;

    @FXML
    Button Logout;
    @FXML
    TextField TextField;
    @FXML
    Label AgeLabel;

    @FXML
    Button SendMessage;
    @FXML
    Label ReplyLabel;
    @FXML
    CheckBox myCheckBox;
    @FXML
    ImageView ImageCheck;
    @FXML
            Label RadioLabel;
    @FXML
            RadioButton r1;
    @FXML
            RadioButton r2;

    Image im1=new Image(getClass().getResourceAsStream("raju.jpg"));
    Image im2=new Image(getClass().getResourceAsStream("raju2.jpg"));

    public void change(ActionEvent e){
        if(myCheckBox.isSelected()){
            ImageCheck.setImage(im1);
        }
        else{
            ImageCheck.setImage(im2);
        }
    }

    int age;
    String message;
    public void showUser(String username){
        AgeLabel.setText("Hello"+username);
    }

    public void submit(ActionEvent event){
       /* try {
            age = Integer.parseInt(TextField.getText());
            AgeLabel.setText("Your age is "+age);
        }
        catch(NumberFormatException e){
            AgeLabel.setText("Please enter a date");
        }*/
        try {
            message = TextField.getText();

            if (message.compareTo("Hi")==0) {
                ReplyLabel.setText("Hello, my friend!");
            } else if (message.compareTo("How are you?")==0) {
                ReplyLabel.setText("I am fine, and you?");
            } else if (message.compareTo("I am fine as well")==0) {
                ReplyLabel.setText("How old are you?");
            } else if (Integer.parseInt(message) < 18) {
                ReplyLabel.setText("You are too young for this");
            } else if (Integer.parseInt(message) > 18) {
                ReplyLabel.setText("You are older than me!");
            } else if (message.compareTo("Bye")==0) {
                ReplyLabel.setText("See you later!");
            }
            else if(message.toLowerCase().trim().contains("Pizza!")){
                ReplyLabel.setText("I love pizza");
            }
        }
        catch(Exception e){
            ReplyLabel.setText("Error!");
        }

    }

    public void logout(ActionEvent event){
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to log out!");
        alert.setContentText("Do you want to save before logout?");

        if(alert.showAndWait().get()== ButtonType.OK) {

            stage = (Stage) AgeAnchor.getScene().getWindow();
            System.out.println("Log out");
            stage.close();
        }
    }
    public void getFood(ActionEvent event){
        if(r1.isSelected()){
            RadioLabel.setText("Pizza");
        }
        else if(r2.isSelected()){
            RadioLabel.setText("Burger");
        }
    }
}
