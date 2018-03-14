package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
    
    private AlienDictionary ad = new AlienDictionary();
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	String stringa = txtWord.getText();
    	String[] array= stringa.split(" ");
    	
    	if(stringa.matches("[a-zA-Z ]+")==false) {
			txtResult.appendText("Sono ammessi solo caratteri\n");
			return;
		}
    	
    	if(array.length>2) {
    		txtResult.appendText("Hai inserito troppe parole\n");
    	}
    	else if(array.length == 2) {
    		String aliena = array[0];
    		String traduzione = array[1];
    		
    		
    		
    		
    		ad.addWord(aliena, traduzione);
    		txtResult.appendText("Hai inserito la traduzione della parola "+aliena+"\n");
    	}
    	else if(array.length==1) {
    		String aliena = array[0];
    		
    		
    		
    		txtResult.appendText(ad.translateWord(aliena)+"\n");
    		
    		
    	}
    	
    	txtWord.clear();
    	    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {

    	txtResult.clear();
    	txtWord.clear();
    	
    	
    }
    
}
