/**
 * 
 */
package com.mscs.service.impl;

import java.util.List;

import com.mscs.dto.Card;
import com.mscs.exception.MSCSException;
import com.mscs.repository.CardRepository;
import com.mscs.service.CardService;

/**
 * @author nstanwar
 *
 */
public class CardServiceImpl implements CardService<Card>{

	private CardRepository<Card> cardRepository;

	/**
	 * 
	 */
	public CardServiceImpl(){
	}
	
	/**
	 * 
	 */
	public CardServiceImpl(CardRepository<Card> cardRepository) {
		this.cardRepository = cardRepository;
	}
	
	public synchronized Card add(Card card) throws MSCSException{
		return cardRepository.add(card);
	}

	public synchronized Card get(String id) throws MSCSException{
		return cardRepository.get(id);
	}

	public List<Card> getAll() throws MSCSException{
		return cardRepository.getAll();
	}

	public synchronized Card update(Card a) throws MSCSException{
		return cardRepository.update(a);
	}

}
