/**
 * 
 */
package com.mscs.service.impl;

import java.util.List;

import com.mscs.dto.TravelInfo;
import com.mscs.exception.MSCSException;
import com.mscs.repository.TravelRepository;
import com.mscs.service.TravelService;

/**
 * @author nstanwar
 *
 */
public class TravelServiceImpl  implements TravelService<TravelInfo>{

	private TravelRepository<TravelInfo> travelRepository;

	/**
	 * 
	 */
	public TravelServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 */
	public TravelServiceImpl(TravelRepository<TravelInfo> travelRepository) {
		this.travelRepository= travelRepository;
	}

	public synchronized TravelInfo get(String id) throws MSCSException{
		// TODO Auto-generated method stub
		return travelRepository.get(id);
	}

	public synchronized TravelInfo add(TravelInfo travelInfo) throws MSCSException{
		// TODO Auto-generated method stub
		return travelRepository.add(travelInfo);
	}
	
	public synchronized List<TravelInfo> getAll() throws MSCSException{
		// TODO Auto-generated method stub
		return travelRepository.getAll();
	}

}
