module com.example.e_comm {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.e_comm to javafx.fxml;
    exports com.example.e_comm;
}