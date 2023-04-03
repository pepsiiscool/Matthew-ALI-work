module com.example.assignment3gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment3gui to javafx.fxml;
    exports com.example.assignment3gui;
}