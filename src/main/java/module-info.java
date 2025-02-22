module org.example.mod3p3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.mod3p3 to javafx.fxml;
    exports org.example.mod3p3;
}