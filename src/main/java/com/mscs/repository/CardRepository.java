/**
 * 
 */
package com.mscs.repository;

import java.util.List;

import com.mscs.exception.MSCSException;

/**
 * @author nstanwar
 *
 */
public interface CardRepository<Card> extends Repository<Card>{
	/**
	 * Add start card /Issue smart card 
	 * @param card
	 * @return
	 */
	public Card add(Card card) throws MSCSException;
	/**
	 * Get Samrt Card Detail based on card no.
	 * @param id
	 * @return
	 */
	public Card get(String id) throws MSCSException;
	/**
	 * List all smart cards
	 * @return cardList
	 */
	public List<Card> getAll() throws MSCSException;
}
