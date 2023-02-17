module com.bthtam.project1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bthtam.project1 to javafx.fxml;
    exports com.bthtam.project1;
}
