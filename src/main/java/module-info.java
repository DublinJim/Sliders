module com.example.sliders {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sliders to javafx.fxml;
    exports com.example.sliders;
}