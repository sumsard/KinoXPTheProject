package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
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
        TextArea newsSection = new TextArea();
        headline.setAlignment(Pos.CENTER);


        VBox buttonBox = new VBox(orderticketButton, cancelTicketButton, enlargeTextButton, loguotButton);
        buttonBox.setSpacing(50);

        newsSection.setWrapText(true);
        newsSection.setText("\"Spodermen: 420 Blaze it\" - Kommer den 15/11/2017");
        newsSection.setMinSize(600.0,800.0);
        newsSection.setMaxSize(600.0, 800.0);

        TableView reservationView = new TableView();
        reservationView.setEditable(false);
        reservationView.setMinSize(600.0,800.0);
        reservationView.setMaxSize(600.0, 800.0);

        /* Her skal vores tableview være Observable så det opdatere når kunden logger ind*/

        //Der er ikke lavet andet en reservationer på start siden da det var det eneste vores opagve lød på.












        bp.setCenter(newsSection);
        bp.setRight(reservationView);
        bp.setLeft(buttonBox);
        bp.setTop(headline);
        bp.setPadding(new Insets(25,2,25,2));

        Scene scene = new Scene(bp, 1600, 900);


        //-----------------------------------Event Handlers------------------------------------//

        loguotButton.setOnAction(e -> {

        });

        orderticketButton.setOnAction(e -> {

        });

        enlargeTextButton.setOnAction(e -> {

        });

        cancelTicketButton.setOnAction(e -> {

        });

        return scene;
    }
}

