/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houserent;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Nayan Roy
 */
public class AdminPanelController implements Initializable {

     @FXML
    private Button add_btn;

    @FXML
    private TextField rent_filed;

    @FXML
    private Button up_btn;

    @FXML
    private Button reset_btn;

    @FXML
    private TextField due_field;

    @FXML
    private TextField Unit_field;

    @FXML
    private TextField Month_filed;

    @FXML
    private TextField details_field;

    @FXML
    private TextField floor_field;

    @FXML
    void Reset(ActionEvent event) {

    }

    @FXML
    void Add(ActionEvent event) {

    }

    @FXML
    void Update(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
