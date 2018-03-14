package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {
	private String alienW;
	private String translation;
	private List<String> traduzioni = new ArrayList<String>();
	
	public WordEnhanced(String alienWord, String translation) {
		
		this.alienW = alienWord.toLowerCase();
		this.translation = translation.toLowerCase();
		traduzioni.add(translation);
	}

	
	public String getAlienWord() {
		return alienW;
	}

	public void setAlienWord(String alienWord) {
		this.alienW = alienWord.toLowerCase();
	}
	
	public void aggiungiTraduzione(String trad) {
		traduzioni.add(trad);
	}
	
	public String listaTraduzioni(){
		String result = "";
		for(String s : traduzioni)
			result += s+" \n";
		return result;
	}
	
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		WordEnhanced wtemp = (WordEnhanced) o;
		if(this.alienW.compareToIgnoreCase(wtemp.getAlienWord())==0)
		return true;
		return false;
	}
}
