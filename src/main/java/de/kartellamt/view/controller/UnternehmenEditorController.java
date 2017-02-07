package de.kartellamt.view.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;

public class UnternehmenEditorController implements Initializable {
	
	@FXML
	TextField unternehmenText;
	
	@FXML
	TextField FallaktenText;
	
	@FXML
	TextField nameText;
	
	@FXML
	TextField PLZText;
	
	@FXML
	TextField ortText;
	
	@FXML
	TextField strasseText;
	
	@FXML
	TextField hausText;
	
	@FXML
	Button restButton;
	
	@FXML
	Button submitButton;
	
	@FXML
	ColorPicker colorPicker;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

}
