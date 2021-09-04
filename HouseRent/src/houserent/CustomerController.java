/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houserent;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Nayan Roy
 */
public class CustomerController implements Initializable {

    @FXML
    private TextField month_field;

    @FXML
    private Label Due_lbl;

    @FXML
    private TextField Floor1_id;

    @FXML
    private Label Floor_lbl;

    @FXML
    private Label details_lbl;

    @FXML
    private Label Rent_lbl;

    @FXML
    private Label Month_lbl;

    @FXML
    private TextField Unit1_rent;

    @FXML
    private Label Customer_lbl;

    @FXML
    private Label rent_lbl;

    @FXML
    private Label Details_lbl;

    @FXML
    private Label Unit_lbl;

    @FXML
    private Label due_lbl;

    @FXML
    private Button Check_btn;
   
    @FXML
    private Button back_btn;


    @FXML
    void Check(ActionEvent event) {
        
        try
        {
            DBConnect connect = new DBConnect();
            Connection conn = connect.getConnection();
            String query ="SELECT * FROM tb_tenant WHERE Floor=? && Unit = ? && Month=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, Floor1_id.getText());
            ps.setString(2, Unit1_rent.getText());
            ps.setString(3,month_field.getText());
            ResultSet rs = ps.executeQuery();
            rs.next();
            rent_lbl.setText(rs.getString("Rent"));
            details_lbl.setText(rs.getString("Details"));
            due_lbl.setText(rs.getString("Due"));
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Data not found");
        }

    }
    
    @FXML
    void Back(ActionEvent event )throws IOException
    {
        HouseRent.load("Main.fxml");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
