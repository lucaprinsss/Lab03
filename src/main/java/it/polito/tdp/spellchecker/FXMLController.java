/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.spellchecker;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.spellchecker.model.Modello;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class FXMLController {
	
	private Modello model;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnCheck"
    private Button btnCheck; // Value injected by FXMLLoader

    @FXML // fx:id="btnClear"
    private Button btnClear; // Value injected by FXMLLoader

    @FXML // fx:id="cmbLanguage"
    private ComboBox<?> cmbLanguage; // Value injected by FXMLLoader

    @FXML // fx:id="lblError"
    private Label lblError; // Value injected by FXMLLoader

    @FXML // fx:id="lblTime"
    private Label lblTime; // Value injected by FXMLLoader

    @FXML // fx:id="txtText"
    private TextArea txtText; // Value injected by FXMLLoader

    @FXML // fx:id="txtWrongWord"
    private TextArea txtWrongWord; // Value injected by FXMLLoader

    @FXML
    void doCheck(ActionEvent event) {

    }

    @FXML
    void doClear(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnCheck != null : "fx:id=\"btnCheck\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";
        assert cmbLanguage != null : "fx:id=\"cmbLanguage\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblError != null : "fx:id=\"lblError\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblTime != null : "fx:id=\"lblTime\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtText != null : "fx:id=\"txtText\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtWrongWord != null : "fx:id=\"txtWrongWord\" was not injected: check your FXML file 'Scene.fxml'.";

    }
    
    public void setModel(Modello model) {
    	this.model=model;
    }

}
