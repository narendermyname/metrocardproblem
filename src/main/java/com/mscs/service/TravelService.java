
/**
 * 
 */
package com.mscs.service;

import java.util.List;

/**
 * @author nstanwar
 *
 */
public interface TravelService<TravelInfo> extends Service<TravelInfo> {
	/**
	 * Add travel record
	 */
	public TravelInfo add(TravelInfo travelInfo);
	/**
	 * Get TravelInfo
	 */
	public TravelInfo get(String id);
	/**
	 * List all travel info objects.
	 * return travelInfoList
	 */
	public List<TravelInfo> getAll();
}
