/**
 * 
 */
package com.mscs.junit.test;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mscs.controller.Controller;
import com.mscs.dto.Card;
import com.mscs.dto.TravelInfo;
import com.mscs.exception.MSCSException;

import junit.framework.Assert;

/**
 * @author nstanwar
 *
 */
public class MSCSCJunitTest {

	Controller controller;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		controller = new Controller();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		controller = null;
	}

	/**
	 * Test case #TCN1
	 * Test method for {@link com.mscs.controller.Controller#purchaseCard(java.lang.Double)}.
	 */
	@Test
	public void testPurchaseCard() {

		//fail("Not yet implemented");
		Card card = controller.purchaseCard((double) 1000);
		//System.out.println(card);
		Assert.assertTrue("Checking if card No present or not .",card.getCardNo()!= null);
	}

	/**
	 * Test case #TCN2
	 * Test method for {@link com.mscs.controller.Controller#recharge(java.lang.String, java.lang.Double)}.
	 */
	@Test
	public void testRecharge() {
		Card card = controller.purchaseCard((double) 1000);
		//fail("Not yet implemented");
		Card cardR = controller.recharge(card.getCardNo(), (double) 1000);
		//System.out.println(cardR);
		Assert.assertEquals("Purchased card amount is equal to 2005.5",card.getAvailableAmount(), 2000.0, 1);
	}

	/**
	 * Test method for {@link com.mscs.controller.Controller#get(java.lang.String)}.
	 */
	@Test
	public void testGet() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.mscs.controller.Controller#getAllcards()}.
	 */
	@Test
	public void testGetAllcards() {
		//fail("Not yet implemented");
	}

	/**
	 * Test case #TCN3,TCN7
	 * Test method for {@link com.mscs.controller.Controller#travel(com.mscs.dto.TravelInfo)}.
	 */
	@Test
	public void testTravelNormalScenerio() {
		TravelInfo travel = new TravelInfo();
		travel.setSourceStation("A1");
		travel.setDestinationStation("A10");
		Card card = controller.purchaseCard((double) 1000);
		travel.setTraveledSmardCard(card.getCardNo());
		controller.travel(travel);
		//System.out.println(travel);
		//fail("Not yet implemented");
	}
	/**
	 * Test Case # TCN4 TCN5 TCN6

	 */
	@Test(expected = MSCSException.class)
	public void testAmountInCardNotEnoughToTravel() {
		TravelInfo travel = new TravelInfo();
		travel.setSourceStation("A1");
		travel.setDestinationStation("A10");
		Card card = controller.purchaseCard((double) 1);
		travel.setTraveledSmardCard(card.getCardNo());
		controller.travel(travel);
		//System.out.println(travel);
		//fail("Not yet implemented");
	}
	/**
	 * Test case # TCN9
	 */
	@Test(expected = MSCSException.class)
	public void testSourceDestinationAreSame() {
		TravelInfo travel = new TravelInfo();
		travel.setSourceStation("A1");
		travel.setDestinationStation("A1");
		Card card = controller.purchaseCard((double) 1);
		travel.setTraveledSmardCard(card.getCardNo());
		controller.travel(travel);
		//System.out.println(travel);
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.mscs.controller.Controller#getMyCardReport(java.lang.String)}.
	 */
	@Test
	public void testGetMyCardReport() {
		Card card = controller.purchaseCard((double) 1000);
		//traveling 1
		TravelInfo travel = new TravelInfo();
		travel.setSourceStation("A1");
		travel.setDestinationStation("A10");
		travel.setTraveledSmardCard(card.getCardNo());
		travel = controller.travel(travel);
		//System.out.println(travel);
		//traveling 1 back
		TravelInfo travel1 = new TravelInfo();
		travel1.setSourceStation("A10");
		travel1.setDestinationStation("A1");
		travel1.setTraveledSmardCard(card.getCardNo());
		travel1 = controller.travel(travel1);
		//System.out.println(travel1);
		//traveling 2
		TravelInfo travel2 = new TravelInfo();
		travel2.setSourceStation("A1");
		travel2.setDestinationStation("A10");
		travel2.setTraveledSmardCard(card.getCardNo());
		travel2 = controller.travel(travel2);
		//System.out.println(travel2);
		//traveling 2 back
		TravelInfo travel13 = new TravelInfo();
		travel13.setSourceStation("A10");
		travel13.setDestinationStation("A1");
		travel13.setTraveledSmardCard(card.getCardNo());
		travel13 = controller.travel(travel13);
		//System.out.println(travel13);
		List<TravelInfo> travelInfos =  controller.getMyCardReport(card.getCardNo());
		double amountSpentIntravel =0.0;
		for(TravelInfo travel0 :travelInfos){
			amountSpentIntravel+=travel0.getTravelFare();
			System.out.println("Card "+travel0.getTraveledSmardCard()+" use to travel from station "+travel0.getSourceStation()+" to station \n "+travel0.getDestinationStation()+". Fare is Rs "+travel0.getTravelFare()+" and balance of card is "+travel0.getCardCurrentBalance());
		}
		double sumOfTravelsFare = travel.getTravelFare()+travel1.getTravelFare()+travel13.getTravelFare()+travel2.getTravelFare();
		Assert.assertTrue("Amount spent in my 2 travel euqals",(amountSpentIntravel ==sumOfTravelsFare));
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.mscs.controller.Controller#getFootFallOfStation(java.lang.String)}.
	 */
	@Test
	public void testGetFootFallOfStation() {
		Card card = controller.purchaseCard((double) 1000);
		//traveling 1
		TravelInfo travel = new TravelInfo();
		travel.setSourceStation("A1");
		travel.setDestinationStation("A10");
		travel.setTraveledSmardCard(card.getCardNo());
		travel = controller.travel(travel);
		//System.out.println(travel);
		//traveling 1 back
		TravelInfo travel1 = new TravelInfo();
		travel1.setSourceStation("A10");
		travel1.setDestinationStation("A1");
		travel1.setTraveledSmardCard(card.getCardNo());
		travel1 = controller.travel(travel1);
		//System.out.println(travel1);
		//traveling 2
		TravelInfo travel2 = new TravelInfo();
		travel2.setSourceStation("A1");
		travel2.setDestinationStation("A10");
		travel2.setTraveledSmardCard(card.getCardNo());
		travel2 = controller.travel(travel2);
		//System.out.println(travel2);
		//traveling 2 back
		TravelInfo travel13 = new TravelInfo();
		travel13.setSourceStation("A10");
		travel13.setDestinationStation("A1");
		travel13.setTraveledSmardCard(card.getCardNo());
		travel13 = controller.travel(travel13);
		//System.out.println(travel13);

		int footFall = controller.getFootFallOfStation("A1");
		Assert.assertTrue("Foot fall to Station A1 is 2 but it is"+footFall,footFall==2);
	}

}
