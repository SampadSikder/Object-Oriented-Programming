package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane grid=new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));

        Text sceneTitle=new Text("Hello");
        sceneTitle.setFont(Font.font("Tohama", FontWeight.NORMAL,20));
        grid.add(sceneTitle,0,0,2,1);

        Label username=new Label();
        grid.add(username,0,1);

        TextField usertext=new TextField();
        grid.add(usertext,1,1);

        Label pass=new Label();
        grid.add(pass,0,2);

        PasswordField ps=new PasswordField();
        grid.add(ps,1,2);

        Button btn=new Button("Sign in");
        HBox hbbtn=new HBox(10);
        hbbtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbbtn.getChildren().add(btn);
        grid.add(hbbtn,1,3);

        final Text actiontarget=new Text();
        grid.add(actiontarget,1,6);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            ActionEvent x=new ActionEvent();
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.RED);
                actiontarget.setText("Password wrong!");
            }
        });




        Scene sc=new Scene(grid,300,275);
        primaryStage.setScene(sc);
        primaryStage.setTitle("JavaFX welcome;");
        primaryStage.show();


        }




    public static void main(String[] args) {
        launch(args);
    }

}