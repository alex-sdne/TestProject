module com.mycompany.textentry {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.textentry to javafx.fxml;
    exports com.mycompany.textentry;
}
