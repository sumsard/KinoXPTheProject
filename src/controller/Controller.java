package controller;

import javafx.stage.Stage;
import model.User;
import view.KasseBooking;
import view.Reservation;
import view.SignUp;

public class Controller {

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
                stage.setScene(kasseBooking.kasseBooking(stage));
            } else {
                stage.setTitle("Menu");
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
        stage.setScene(signUp.signUp(stage));
    }



    /*
    Menu scene
     */

}
