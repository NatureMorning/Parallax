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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

@Controller
public class CashierMenuDeliveryController implements Initializable {

    @FXML
    private TextField customerName;
    @FXML
    private TextField address;
    @FXML
    private Button cancel;
    @FXML
    private Button save;
    @FXML
    private TableView<?> deliveryTable;
    @FXML
    private TableColumn<?, ?> colName;
    @FXML
    private TableColumn<?, ?> colAddress;
    @FXML
    private Button reset;

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
    private void cancel(ActionEvent event) {
        stageManager.switchScene(FxmlView.CASHIER);
    }

    @FXML
    private void save(ActionEvent event) {
    }

    @FXML
    private void reset(ActionEvent event) {
    }
    
}
