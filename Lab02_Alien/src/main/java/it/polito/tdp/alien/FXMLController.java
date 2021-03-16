package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.*;

public class FXMLController {
	LinkedList<AlienDictionary> traduzione;
	AlienDictionary alienDictionary;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtTesto;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doReset(ActionEvent event) {

    }

    @FXML
    void doTranlsate(ActionEvent event) {
    String word = this.txtTesto.getText();
    
   
    	if(word.contains(";")) {
    		String parole[] = word.split(";");
    		String alienWord =parole[0];
    		String translation =parole[1];
    			if (alienWord.toLowerCase().matches("[a-z]*") && translation.toLowerCase().matches("[a-z]*")) {
    				this.alienDictionary.addWord(alienWord, translation);
    				txtResult.setText("Aggiunta nuova traduzione della parola " + alienWord + ": " + translation);
    			}
    			else
        			this.txtResult.setText("Devi inserire una parola!");
    	}
    	else {
    		if (word.toLowerCase().matches("[a-z]*")) {
    		String traduzione = this.alienDictionary.translateWord(word);
    		txtResult.setText("La traduzione di " + word + " è " + traduzione );
    	}
    		else
    			this.txtResult.setText("Devi inserire una parola!");
    	} 
   }
    	

  
    @FXML
    void initialize() {
        assert txtTesto != null : "fx:id=\"txtTesto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        traduzione = new LinkedList<AlienDictionary>();
        alienDictionary = new AlienDictionary();
    	}
   }
