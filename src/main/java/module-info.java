module de.iav.firstapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.iav.firstapp to javafx.fxml;
    exports de.iav.firstapp;
}