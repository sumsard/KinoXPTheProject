package view;

import controller.Controller;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by nickl on 02-10-2017.
 */
public class Reservation {


    public Scene RScene(Stage stage) throws Exception{

        BorderPane bp = new BorderPane();
        bp.getStylesheets().add("view/css/reservationStylesheet.css");
        Button loguotButton = new Button("Log ud");
        Button orderticketButton = new Button("Bestil billet");
        Button enlargeTextButton = new Button("Forstør tekst");
        Button cancelTicketButton = new Button("Afbestil");
        Label headline = new Label("MainScene");
        headline.setAlignment(Pos.CENTER);


        VBox buttonBox = new VBox(orderticketButton, cancelTicketButton, enlargeTextButton, loguotButton);
        buttonBox.setSpacing(50);

        TableView reservationView = new TableView();
        reservationView.setEditable(false);
        reservationView.setMinSize(800.0,800.0);
        reservationView.setMaxSize(800.0, 800.0);
        /* Her skal vores tableview være Observable så det opdatere når kunden logger ind*/

        //Der er ikke lavet andet en reservationer på start siden da det var det eneste vores opagve lød på.












        bp.setCenter(reservationView);
        bp.setLeft(buttonBox);
        bp.setTop(headline);
        bp.setPadding(new Insets(25));

        Scene scene = new Scene(bp, 1200, 900);


        //-----------------------------------Event Handlers------------------------------------//

        Controller controller = new Controller();

        loguotButton.setOnAction(e -> controller.logoutButtonPressed(stage));

        orderticketButton.setOnAction(e -> {

        });

        enlargeTextButton.setOnAction(e -> {

        });

        cancelTicketButton.setOnAction(e -> {

        });

        return scene;
    }
}

