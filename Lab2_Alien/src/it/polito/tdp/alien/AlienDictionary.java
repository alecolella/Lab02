package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	private List<Word> dizionario;
	private List<WordEnhanced> dizionarioEnh;
	
	public AlienDictionary() {
		
		this.dizionario = new ArrayList<Word>();
		this.dizionarioEnh = new ArrayList<WordEnhanced>();
	}

	/*public void addWord(String alienWord, String translation) {
		Word w = new Word(alienWord, translation);
		
		for(Word wtemp : dizionario) {
			if(wtemp.equals(w) == true) {
				wtemp.setTranslation(translation);
				return;
			}
		
		}
		dizionario.add(w);
	}*/
	
	public void addWord(String alienWord, String translation) {
		WordEnhanced we = new WordEnhanced(alienWord, translation);
		
		for(WordEnhanced wtemp : dizionarioEnh) {
			if(wtemp.equals(we) == true) {
				wtemp.aggiungiTraduzione(translation);
				return;
			}
		
		}
		dizionarioEnh.add(we);
	}
	
	public String translateWord(String alienWord) {
		
		for(WordEnhanced we : dizionarioEnh) {
			if(we.getAlienWord().compareToIgnoreCase(alienWord)==0)
				return we.listaTraduzioni();
		}
		
		for(Word w : dizionario) {
			if(w.getAlienWord().compareToIgnoreCase(alienWord)==0) {
				return w.getTranslation();
			}
		}
		return null;
	}
	
	

}
