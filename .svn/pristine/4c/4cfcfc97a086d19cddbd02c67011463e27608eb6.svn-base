package de.kartellamt.view.controller;

import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;

import de.kartellamt.commandline.ProjectSelection;
import de.kartellamt.start.TableSelection;
import de.kartellamt.start.ViewProjectSelection;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.stage.Stage;
public class ProjectSelectionViewController implements Initializable {
	
	
	
	
	@FXML
	private Button bstart;
	
	@FXML
	private Button babbruch;
	
	@FXML
	private ListView<String> listviewprojects;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		bstart.setDisable(true);
		listviewprojects.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		listviewprojects.setItems( generateJList());
		listviewprojects.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue ) -> {
		bstart.setDisable(false);	
		ViewProjectSelection.setDbUrl(newValue);
		});
		
		babbruch.setOnAction((event) -> {
		Stage stage = (Stage) babbruch.getScene().getWindow();
		stage.close();
		System.exit(1);
		});
		
		bstart.setOnAction((event) -> {
			TableSelection.launchViewTableSelection();	
		});
	}
	
	private ObservableList<String> generateJList() {
		ProjectSelection projectSelection = new ProjectSelection();
		HashSet<String> autoriztedProjects = projectSelection.autorizatedProjects();
		ObservableList<String> items =FXCollections.observableArrayList (autoriztedProjects);
		return items;
	}
	
	

}
