/**
 * 
 */
package com.mscs.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mscs.dto.Card;
import com.mscs.dto.TravelInfo;
import com.mscs.exception.MSCSException;

/**
 * @author nstanwar
 *
 */
public class Controller extends BaseController{

	public Controller(){

	}
	/**
	 * Purchase card
	 * @param rechardgeAmount
	 * @return
	 */
	public Card purchaseCard( Double rechardgeAmount){
		Card card = new Card();
		card.setCardNo(getId());
		if(rechardgeAmount !=null){
			card.setAvailableAmount(defaultAmount+rechardgeAmount);
		}else{
			card.setAvailableAmount(defaultAmount);
		}
		return cardService.add(card);
	}
	/**
	 * Recharge card
	 * @param id
	 * @param amount
	 * @return
	 */
	public Card recharge(String id,Double amount) throws MSCSException{
		Card card= cardService.get(id);
		card.setAvailableAmount(card.getAvailableAmount()+amount);
		Card updatedCard = cardService.update(card);
		return updatedCard;
	}
	/**
	 * Get card Info
	 * @param id
	 * @return
	 */
	public Card get(String id) throws MSCSException{
		Card card = cardService.get(id);
		return card;
	}
	/**
	 * Get All card
	 * @return
	 */
	public List<Card> getAllcards() throws MSCSException{
		List<Card> cardList = cardService.getAll();
		return cardList;

	}

	public TravelInfo travel(TravelInfo travel) throws MSCSException{

		travel.setId(getId());
		travel.setTime(new Date());
		//checking available amount  in card
		Card card = cardService.get(travel.getTraveledSmardCard());
		Date date =new Date();
		int day =date.getDay();
		int source = stationMap.get(travel.getSourceStation());
		int dest = stationMap.get(travel.getDestinationStation());
		if(source == dest){
			throw new MSCSException("Source and destination can't not be same");
		}
		//week days
		if(day > 0 && day <6){ 
			//going forward
			if(card.getAvailableAmount() < 7.0){
				throw new MSCSException("Card don't have suffecient amount to travel.");
			}
		}else if (day == 0 || day == 6){
			//weeked days
			if(card.getAvailableAmount() < 5.5){
				throw new MSCSException("Card don't have suffecient amount to travel.");
			}
		}

		Double travelFare = calculateTravelCharges(travel.getSourceStation(),travel.getDestinationStation());
		if(travelFare > card.getAvailableAmount()){
			//change with an amount 100 rupee
			//card = recharge(card.getCardNo(), (double) 1000);
			throw new MSCSException("Please rechardge your card don't have enough balance exit.");
		}

		//if card have enough available point then deduct amount 
		if(travelFare <= card.getAvailableAmount()){
			card.setAvailableAmount(card.getAvailableAmount()-travelFare );
			cardService.update(card);
			travel.setTravelFare(travelFare);
			travel.setCardCurrentBalance(card.getAvailableAmount());
			travel = travelService.add(travel);
		}

		return travel;

	}
	/**
	 * Calculate travel changes based on source or destination station and based on weekdays 
	 * @param sourceStation
	 * @param destinationStation
	 * @return
	 */
	private Double calculateTravelCharges(String sourceStation ,String destinationStation){
		Double travelCharge =  new Double(0);
		Date date =new Date();
		int day =date.getDay();
		int source = stationMap.get(sourceStation);
		int dest = stationMap.get(destinationStation);
		double stationTraveled = 0;
		//week days
		if(day > 0 && day <6){ 
			//going forward
			if(dest > source){
				stationTraveled = (dest - source)+1;
			}
			//comming back
			if(dest < source){
				stationTraveled = (source - dest)+1;
			}
			travelCharge = stationTraveled*7;

		}else if (day == 0 || day == 6){
			//weeked days
			//going forward
			if(dest > source){
				stationTraveled = (dest - source)+1;
			}
			//comming back
			if(dest < source){
				stationTraveled = (source - dest)+1;
			}
			travelCharge = stationTraveled*5.5;
		}
		return travelCharge;
	}
	/**
	 * Get My Travel smart card info
	 * @param id
	 * @return
	 * @throws MSCSException
	 */
	public List<TravelInfo> getMyCardReport(String id) throws MSCSException{
		List<TravelInfo> travelInfos = travelService.getAll();
		List<TravelInfo> travelInforesponce = new ArrayList<TravelInfo>();
		for(TravelInfo travel :travelInfos){
			travelInforesponce.add(travel);
		}
		return travelInforesponce;
	}
	/**
	 * Get foot fall for a specific station
	 * @param station
	 * @return
	 */
	public int getFootFallOfStation(String station){
		int footFall = 0;
		List<TravelInfo> travelInfos = travelService.getAll();
		for(TravelInfo travel :travelInfos){
			if(travel.getSourceStation() == station){
				footFall++;
			}
		}
		return footFall;

	}
}
