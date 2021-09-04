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
public class OwnerpageController implements Initializable {

      @FXML
    private Label Due_lbl;

    @FXML
    private Label Ownerpage_lbl;

    @FXML
    private Label Floor_lbl;

    @FXML
    private TextField Rent_filed;

    @FXML
    private Label Rent_lbl;

    @FXML
    private Label Month_lbl;

    @FXML
    private TextField Month_filed;

    @FXML
    private Label Details_lbl;

    @FXML
    private Button Update_btn;

    @FXML
    private Label Unit_lbl;

    @FXML
    private TextField Due_field;

    @FXML
    private Button Add_btn;

    @FXML
    private Button Reset_btn;

    @FXML
    private TextField Unit_field;

    @FXML
    private TextField floor_field;

    @FXML
    private TextField Details_field;
      @FXML
    private Button ok_id;

    @FXML
    void Reset(ActionEvent event) {
        floor_field.setText("");
        Rent_filed.setText("");
        Due_field.setText("");
        Unit_field.setText("");
        Month_filed.setText("");
        Details_field.setText("");
        
    }

    @FXML
    void Add(ActionEvent event) {
 
        try
        {
        DBConnect connect = new DBConnect();
        Connection conn = connect.getConnection();
        String query= "INSERT INTO tb_tenant(Floor,Unit,Month,Details,Rent,Due) VALUES (?,?,?,?,?,?)";
        PreparedStatement ps =conn.prepareStatement(query);
        ps.setString(1, floor_field.getText());
        ps.setString(2, Unit_field.getText());
        ps.setString(3, Month_filed.getText());
        ps.setString(4, Details_field.getText());
        ps.setInt(5, Integer.parseInt(Rent_filed.getText()));
        ps.setInt(6, Integer.parseInt(Due_field.getText()));
        System.out.println(ps.toString());
        ps.execute();
            JOptionPane.showMessageDialog(null, "Data inserted Successfully");
            Reset(event);
        }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null, "Data insertion failed");
        }
    }

    @FXML
    void Update(ActionEvent event) {
        try{
        DBConnect connect = new DBConnect();
        Connection conn = connect.getConnection();
        String query = "UPDATE tb_tenant SET Rent=?, Due = ? WHERE Floor = ? && Unit = ? && Month = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, Integer.parseInt(Rent_filed.getText()));
        ps.setInt(2, Integer.parseInt(Due_field.getText()));
        ps.setString(3, floor_field.getText());
        ps.setString(4, Unit_field.getText());
        ps.setString(5, Month_filed.getText());
        ps.execute();
        JOptionPane.showMessageDialog(null, "Data Updated Successfully");
        Reset(event);
    }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Data update failed");
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
