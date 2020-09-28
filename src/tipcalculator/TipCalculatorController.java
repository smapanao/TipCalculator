/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipcalculator;

import java.net.URL;
import java.util.ResourceBundle;
import java2.model.Bill;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author seanmapanao
 */




public class TipCalculatorController implements Initializable {

    @FXML
    private TextField txtBillAmt;
    
    @FXML
    private TextField txtTipPercent;
    
    @FXML
    private Button btnCalc;
    
    @FXML
    private Label lblTipAmount;
    
    @FXML
    private Button btnClear;
    
    @FXML
    private Button btnExit;
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void calcTip(ActionEvent event) throws Exception{
        double billAmt, tipPercent;
        
        billAmt = Double.parseDouble(txtBillAmt.getText());
        tipPercent = Double.parseDouble(txtTipPercent.getText());
        
        Bill bill = new Bill(billAmt, tipPercent);
        
        lblTipAmount.setText(bill.toString());
    }
    @FXML
    private void clear(ActionEvent event) {

    }

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }
    
}
