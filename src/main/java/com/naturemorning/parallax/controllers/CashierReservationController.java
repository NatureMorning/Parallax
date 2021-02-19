/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naturemorning.parallax.controllers;

import com.naturemorning.parallax.config.StageManager;
import com.naturemorning.parallax.views.FxmlView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

@Controller
public class CashierReservationController implements Initializable {

    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField email;
    @FXML
    private TextField phoneNo;
    @FXML
    private TextField guestNo;
    @FXML
    private DatePicker dob;
    @FXML
    private TextField time;
    @FXML
    private TextField rTime;
    @FXML
    private Button confirm;
    @FXML
    private Button cancel;

    @Lazy
    @Autowired
    private StageManager stageManager;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void confirm(ActionEvent event) {
    }

    @FXML
    private void cancel(ActionEvent event) {
        stageManager.switchScene(FxmlView.CASHIER);
    }
    
}
