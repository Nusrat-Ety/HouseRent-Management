/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houserent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController implements Initializable {

     @FXML
    private Button Customer_btm;

    @FXML
    private Label Houserent_lbl;

    @FXML
    private Button Owner_btn;

   @FXML
   void Customer(ActionEvent event) throws IOException
   {
       HouseRent.load("Customer.fxml");
   }
   @FXML
   void Owner(ActionEvent event) throws IOException
   {
       HouseRent.load("LoginPage.fxml");
   }
           
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
