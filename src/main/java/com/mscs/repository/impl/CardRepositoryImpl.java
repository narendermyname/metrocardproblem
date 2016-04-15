/**
 * 
 */
package com.mscs.repository.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mscs.dto.Card;
import com.mscs.exception.MSCSException;
import com.mscs.repository.CardRepository;

/**
 * @author nstanwar
 *
 */
public class CardRepositoryImpl implements CardRepository<Card>{

	private Set<Card> cards =  new HashSet<Card>();
	/**
	 * 
	 */
	public CardRepositoryImpl() throws MSCSException{
		// TODO Auto-generated constructor stub
	}

	public Card add(Card card) throws MSCSException{
		cards.add(card);
		return card;
	}

	public Card get(String id) throws MSCSException{
		if(cards.isEmpty()){
			throw new MSCSException("No Card found.");
		}
		Card cardR = null;
		for(Card card: cards){
			if(card.getCardNo() == id){
				cardR = card;
			}
		}
		if(cardR == null){
			throw new MSCSException("No Card found.");
		}
		return cardR;
	}
	
	public List<Card> getAll() throws MSCSException{
		if(cards.isEmpty()){
			throw new MSCSException("No Card found.");
		}
		return new ArrayList<Card>();
	}

	public Card update(Card a) throws MSCSException{
		if(cards.isEmpty()){
			throw new MSCSException("No Card found.");
		}
		Card cardR = null;
		for(Card card: cards){
			if(card.getCardNo() == a.getCardNo()){
				cardR = card;
			}
		}
		if(cardR == null){
			throw new MSCSException("No Card found.");
		}
		return cardR;
	}

}
