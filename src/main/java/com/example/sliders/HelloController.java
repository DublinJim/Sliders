package com.example.sliders;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private Slider slider1;

    @FXML
    private Text txtOut;

    @FXML
    void showTheValue() {
txtOut.setText(String.valueOf((int)slider1.getValue())); //note the cast
    }

}
