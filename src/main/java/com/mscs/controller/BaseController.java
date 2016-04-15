/**
 * 
 */
package com.mscs.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.mscs.dto.Card;
import com.mscs.dto.TravelInfo;
import com.mscs.factory.Factory;
import com.mscs.service.CardService;
import com.mscs.service.TravelService;

/**
 * @author nstanwar
 *
 */
public abstract class BaseController {

	protected static Double defaultAmount = 0.0;

	protected CardService<Card> cardService = Factory.getFactory().getCardService();
	protected Map<String,Integer> stationMap = new HashMap<String,Integer>(){/**
		 * 
		 */
		private static final long serialVersionUID = -8908624187970000491L;

	{
		put("A1",1);
		put("A2",2);
		put("A3",3);
		put("A4",4);
		put("A5",5);
		put("A6",6);
		put("A7",7);
		put("A8",8);
		put("A9",9);
		put("A10",10);
	}};
	protected TravelService<TravelInfo> travelService = Factory.getFactory().getTravelService();
	/**
	 * 
	 */
	public BaseController() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		String uuid = UUID.randomUUID().toString();
		return uuid;
	}

}
