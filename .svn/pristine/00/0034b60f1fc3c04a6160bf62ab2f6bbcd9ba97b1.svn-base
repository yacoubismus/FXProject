package de.kartellamt.view.controller;

import java.net.URL;
import java.util.ResourceBundle;

import de.kartellamt.start.TableSelection;
import de.kartellamt.start.UnternehmenEditor;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class TableSelectionController implements Initializable {
	
	private final String UNTERNEHMEN = "Unternehmen";
	
	private final String KONZERNE = "Konzerne";
	
	private final String MAERKTE = "Maerkte";
	
	private String table;
	

	@FXML
	private Button konzernb;

	@FXML
	private Button unternehmenb;

	@FXML
	private Button maerkteb;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		konzernb.setOnAction((event) -> {
			table = KONZERNE;	
		});

		unternehmenb.setOnAction((event) -> {
			UnternehmenEditor.launchViewUnternehmenEditor();
			table = UNTERNEHMEN;	
		});

		maerkteb.setOnAction((event) -> {
			table = MAERKTE;	
		});
		
		switch (table) {
		
		case UNTERNEHMEN:
			break;
			
		case KONZERNE:
			break;
			
		case MAERKTE:				
			break;

		default:
			break;
		}

	}
	
	

}
