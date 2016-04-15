/**
 * 
 */
package com.mscs.repository;

import java.util.ArrayList;
import java.util.List;

import com.mscs.exception.MSCSException;

/**
 * @author nstanwar
 *
 */
public interface TravelRepository<TravelInfo> extends Repository<TravelInfo>{

	/**
	 * Add travelinfo  
	 * @param travelInfo
	 * @return travelInfo
	 */
	public TravelInfo add(TravelInfo travelInfo) throws MSCSException;
	/**
	 * Get Samrt Card Detail based on card no.
	 * @param travelInfo
	 * @return travelInfo
	 */
	public TravelInfo get(String id) throws MSCSException;
	/**
	 * List all smart cards
	 * @return travelInfoList
	 */
	public List<TravelInfo> getAll() throws MSCSException;
}
