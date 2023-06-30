package de.iav.firstapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;

public class RegisteredStudentsController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    private Student selectedStudent;

    @FXML
    private ListView<Student> registeredStudents;


    public void initialize() {
        registeredStudents.getItems().addAll(Arrays.asList(
                new Student("Mathias", "Roman", "MZ@iav.de", "Physics" ),
                new Student("Tobias", "Hengel", "TH@iav.de", "Mathematics"))
        );
        registeredStudents.getSelectionModel().selectedItemProperty().addListener((observableValue, student, t1) -> {
            selectedStudent = registeredStudents.getSelectionModel().getSelectedItem();
        });
    }

    @FXML
    public void deleteSelectedStudent() {
        registeredStudents.getItems().remove(selectedStudent);
    }

    public void addStudentToList(Student studentToAdd) {
        registeredStudents.getItems().add(studentToAdd);
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

}
