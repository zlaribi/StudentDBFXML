package de.iav.firstapp;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField courseField;

    @FXML
    protected void onHelloButtonClick() {

        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();
        String courseOfStudies = courseField.getText();

        Student student = new Student(firstName, lastName, email, courseOfStudies);
        System.out.println(student);


        }
    }