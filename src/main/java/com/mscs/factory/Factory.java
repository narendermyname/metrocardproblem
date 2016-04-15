/**
 * 
 */
package com.mscs.factory;

import com.mscs.dto.Card;
import com.mscs.dto.TravelInfo;
import com.mscs.repository.impl.CardRepositoryImpl;
import com.mscs.repository.impl.TravelRepositoryImpl;
import com.mscs.service.CardService;
import com.mscs.service.TravelService;
import com.mscs.service.impl.CardServiceImpl;
import com.mscs.service.impl.TravelServiceImpl;

/**
 * @author nstanwar
 *
 */
public class Factory {

	/**
	 * 
	 */
	public Factory() {
		// TODO Auto-generated constructor stub
	}
	
	private static class FactoryHelper{
		private static Factory factory =  new Factory();
	}
	
	public static Factory getFactory(){
		return FactoryHelper.factory;
	}
	
	public TravelService<TravelInfo> getTravelService(){
		TravelService<TravelInfo> travelService = new TravelServiceImpl(new TravelRepositoryImpl());
		return travelService;
	}
	
	public CardService<Card> getCardService(){
		CardService<Card> cardService = new CardServiceImpl(new CardRepositoryImpl());
		return cardService;
	}

}
