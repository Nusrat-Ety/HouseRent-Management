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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Nayan Roy
 */
public class LoginPageController implements Initializable {
   @FXML
    private Label Username_lbl;

    @FXML
    private Button Login_btn;

    @FXML
    private Label Password_lbl;
    @FXML
    private TextField user_field;

    @FXML
    private PasswordField pass_field;
    
    @FXML
    void Login(ActionEvent event) throws IOException
    {
        try{
        DBConnect connect = new DBConnect();
        Connection conn = connect.getConnection();
        String query = "SELECT * FROM tb_login";
        PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                if(user_field.getText().equals(rs.getString("Username")))
                {
                    if(pass_field.getText().equals(rs.getString("Password")))
                    {
                        HouseRent.load("Ownerpage.fxml");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Username or Password didn't Match");
                }
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
