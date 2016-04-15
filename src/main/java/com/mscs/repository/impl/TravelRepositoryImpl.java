/**
 * 
 */
package com.mscs.repository.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mscs.dto.TravelInfo;
import com.mscs.exception.MSCSException;
import com.mscs.repository.TravelRepository;

/**
 * @author nstanwar
 *
 */
public class TravelRepositoryImpl implements TravelRepository<TravelInfo>{

	private Set<TravelInfo> travelInfos = new HashSet<TravelInfo>();

	/**
	 * 
	 */
	public TravelRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}

	public TravelInfo add(TravelInfo travelInfo) throws MSCSException{
		travelInfos.add(travelInfo);
		return travelInfo;
	}

	public TravelInfo get(String id) throws MSCSException{
		if(travelInfos.isEmpty()){
			throw new MSCSException("No TravelInfo found.");
		}
		TravelInfo travelR = null;
		for(TravelInfo travel: travelInfos){
			if(travel.getId() == id){
				travelR = travel;
			}
		}
		if(travelR == null){
			throw new MSCSException("No TravelInfo found.");
		}
		return travelR;
	}

	public List<TravelInfo> getAll() throws MSCSException{
		if(travelInfos.isEmpty()){
			throw new MSCSException("No TravelInfo found.");
		}
		return new ArrayList<TravelInfo>(travelInfos);
	}

	public TravelInfo update(TravelInfo a) throws MSCSException{
		
		return null;
	}
}
