package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.Map;

public class AlienDictionary {
	
	/*Map<String, String> dizionario = new HashMap<String, String>();
	
	
	public void addWord(String alienWord, String translation) {
		for(int i =0; i<dizionario.size(); i++) {
			if(dizionario.get(alienWord) != null) {
				//dizionario.put(alienWord, translation); //sovrascrive il vecchio valore?
				dizionario.replace(dizionario.get(alienWord), , translation)
			} }	}*/
	
	
	LinkedList<Word> dizionario = new LinkedList<Word>();
	
	public void addWord(String alienWord, String translation) {
		
		Word newWord = new Word(alienWord, translation);
		
		for(Word w : dizionario) {
			if(alienWord.equals(w.getAlienWord())){
				w.setTranslation(translation);
			}
			else
				this.dizionario.add(newWord);
		}
	}
	
	
	public String translateWord(String alienWord) {
		String traduzione = null;
		
		for(Word w: dizionario) {
			if(w.getAlienWord().equals(alienWord)) {
				traduzione = w.getTranslation();
			}
		}
		
		
		return traduzione;
	}
}
