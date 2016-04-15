/**
 * 
 */
package com.mscs.service;

import java.util.List;

import com.mscs.dto.Card;

/**
 * @author nstanwar
 *
 */
public interface CardService<Card> extends Service<Card> {
	
	/**
	 * Add start card record
	 */
	public Card add(Card card);
	/**
	 * Get Card based on id
	 */
	public Card get(String card);
	/**
	 * List all Card objects.
	 * return cardList
	 */
	public List<Card> getAll();
	
	public Card update(Card card);
}
