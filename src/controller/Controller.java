package controller;

import javafx.stage.Stage;
import model.User;
import view.KasseBooking;
import view.Login;
import view.Reservation;
import view.SignUp;

import java.lang.reflect.InvocationTargetException;

public class Controller {

    Login login = new Login();
    Reservation reservation = new Reservation();
    KasseBooking kasseBooking = new KasseBooking();
    SignUp signUp = new SignUp();


    /*
    Login scene
     */
    public void loginButtonPressed(Stage stage, User user) {

        try {
            if (user.getEmail().equalsIgnoreCase("staff")) {
                stage.setTitle("Kasse");
                stage.centerOnScreen();
                stage.setScene(kasseBooking.kasseBooking(stage));
            } else {
                stage.setTitle("Menu");
                stage.centerOnScreen();
                stage.setScene(reservation.RScene(stage));
                stage.centerOnScreen();
                stage.setY(stage.getY() * 3f / 2f);
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public void signUpButtonPressed(Stage stage) {
        stage.setTitle("Sign up");
        stage.centerOnScreen();
        stage.setScene(signUp.signUpScene(stage));
    }

    /*
    SignUp scene
     */
    public void signUpNewUserButtonPressed(Stage stage) {
        stage.setTitle("Menu");
        stage.centerOnScreen();
        try {
            stage.setScene(reservation.RScene(stage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    /*
    Menu scene
     */
    public void logoutButtonPressed(Stage stage) {
        stage.setTitle("Login");
        stage.setScene(login.loginScene(stage));
        stage.centerOnScreen();
        stage.show();
    }

}
