module com.example.dames {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mmn.dames to javafx.fxml;
    exports com.mmn.dames;
}