/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfienator;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.property.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * my Main class
 * @author Matej
 */
public class Selfienator extends Application
{
	private StringProperty textPrvy;
	
	public string getTextPrvy()
    {
        return textPrvy.get();
    }

    public void setTextPrvy(string value)
    {
    	textPrvy.set(value);
    }
	
    public StringProperty textPrvyProperty() {
        return textPrvy;
    }
    
	/**
	 * Starts my app
	 */
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
    
        Scene scene = new Scene(root, 300, 275);
    
        stage.setTitle("Selfienator");
        stage.setScene(scene);
        
        setTextPrvy("Ahoj");
        
        stage.show();
    }
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		launch(args);
	}
	
}
