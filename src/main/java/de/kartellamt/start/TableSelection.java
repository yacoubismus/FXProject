package de.kartellamt.start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TableSelection extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane pane = (BorderPane) FXMLLoader
					.load(ViewProjectSelection.class.getResource("TableSelectionView.fxml"));
			Scene scene = new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Project selection");
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void launchViewTableSelection() {

		launch();
	}

}
