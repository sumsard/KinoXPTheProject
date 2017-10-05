package view;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SignUp {


    public Scene signUp(Stage stage) {

        GridPane gp = new GridPane();
        gp.setHgap(10);
        gp.setVgap(10);

        Scene scene = new Scene(gp, 400,400);

        Label signUpLabel = new Label("Sign up");
        Label usernameLabel = new Label("Username");
        Label emailLabel = new Label("E-mail");
        Label phoneNumberLabel = new Label("Phone number");
        Label passwordLabel = new Label("Password");





        return scene;
    }

}
