/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfienator;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * my Main class
 * 
 * @author Matej
 */
public class Selfienator extends Application {
	private SimpleStringProperty textPrvy;

	public String getTextPrvy() {
		return textPrvy.get();
	}

	public void setTextPrvy(String value) {
		textPrvy.set(value);
	}

	public StringProperty textPrvyProperty() {
		return textPrvy;
	}

	/**
	 * Starts my app
	 */
	public void start(Stage stage) throws Exception {

		textPrvy = new SimpleStringProperty();

		setTextPrvy("Ahoj");

		Parent root = FXMLLoader
				.load(getClass().getResource("MainWindow.fxml"));

		Scene scene = new Scene(root, 300, 275);

		stage.setTitle("Selfienator");
		stage.setScene(scene);

		stage.show();
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
