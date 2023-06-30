package de.iav.firstapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentSummaryController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextArea TextFiledSummary;


    public void setStudentToTextArea(Student studentToPrint) {
        TextFiledSummary.setText(studentToPrint.toString());
    }

    @FXML
    public void switchToRegistration(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("studentDB.fxml"));
        root = loader.load();

        StudentController scene1Controller = loader.getController();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

    @FXML
    public void switchBackToGreetings(ActionEvent backEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("welcome.fxml"));
        root = loader.load();

        GreetingsController scene1Controller = loader.getController();

        stage = (Stage) ((Node) backEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }



}
