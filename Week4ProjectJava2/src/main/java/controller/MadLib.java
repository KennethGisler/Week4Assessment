package controller;

import java.util.ArrayList;

/**
 * Kenneth Gisler - kgisler@dmacc.edu
 * CIS171 22149
 * Sep 22, 2022
 */
public class MadLib {

	private ArrayList<String> userWords = new ArrayList<String>(); //this has all your formated inputs.
	private String holder; //this is so you can always get what you actually put it
	
	public MadLib() {
		super();
	}
	
	public MadLib(String input) { //when you make a madlib you add one word and it 
		this.holder = input;	  // is added to the list after being formatted.
		userWords.add(formatText(input));
	}

	
	//getters
	/**
	 * @return the userWords
	 */
	public ArrayList<String> getUserWords() {
		return userWords;
	}

	/**
	 * @return the holder
	 */
	public String getHolder() {
		return holder;
	}

	//setters
	/**
	 * @param userWords the userWords to set
	 */
	public void setUserWords(ArrayList<String> userWords) {
		this.userWords = userWords;
	}
	/**
	 * @param holder the holder to set
	 */
	public void setHolder(String holder) {
		this.holder = holder;
		this.userWords.add(formatText(holder));
	}
	
	//methods
	public String formatText(String input) { //this makes the first letter upper case, and then lower cases the rest.
		String output = "";					
		input = input.toUpperCase();
		output =  output + input.charAt(0);
		input = input.toLowerCase();
		for(int i = 1; i < input.length(); i++) {
			output = output + input.charAt(i);
		}
		return output;
	}
	
	public String getWordAt(int x) {
		String output;
		output = userWords.get(x);
		return output;
	}
	
	public String getLastWord() {
		int holder = this.userWords.size() - 1;
		return this.userWords.get(holder);
	}
}
