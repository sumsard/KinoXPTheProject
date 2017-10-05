package view;

import controller.Controller;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SignUp {

    public Scene signUpScene(Stage stage) {

        GridPane gp = new GridPane();
        gp.setHgap(10);
        gp.setVgap(10);

        Label usernameLabel = new Label("Username");
        Label emailLabel = new Label("E-mail");
        Label phoneNumberLabel = new Label("Phone number");
        Label passwordLabel = new Label("Password");

        TextField usernameText = new TextField();
        TextField emailText = new TextField();
        TextField phoneNumberText = new TextField();
        TextField passwordText = new TextField();

        Button signUpNewUserButton = new Button("Sign up");
        signUpNewUserButton.setId("signUpNewUser");

        gp.add(usernameLabel,1,1);
        gp.add(usernameText,2,1);
        gp.add(emailLabel,1,2);
        gp.add(emailText,2,2);
        gp.add(phoneNumberLabel,1,3);
        gp.add(phoneNumberText,2,3);
        gp.add(passwordLabel,1,4);
        gp.add(passwordText,2,4);
        gp.add(signUpNewUserButton,1,5,2,1);
        gp.setAlignment(Pos.CENTER);

        Scene scene = new Scene(gp, 400,250);
        scene.getStylesheets().add("view/css/loginStylesheet.css");


        /*
        Events
         */

        Controller controller = new Controller();

        try {
            signUpNewUserButton.setOnAction(event -> controller.signUpNewUserButtonPressed(stage));
        } catch (Exception e) {
            System.out.println(e);
        }


        return scene;
    }

}
