module com.example.javafxsettingbar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxsettingbar to javafx.fxml;
    exports com.example.javafxsettingbar;
}