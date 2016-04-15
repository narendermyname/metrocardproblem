/**
 * 
 */
package com.mscs.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author nstanwar
 *
 */
public class TravelInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5397345203850799456L;
	private String id;
	private String sourceStation;
	private String destinationStation;
	private Date time;
	private String traveledSmardCard;
	private Double travelFare;
	private Double cardCurrentBalance;
	/**
	 * 
	 */
	public TravelInfo() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the sourceStation
	 */
	public String getSourceStation() {
		return sourceStation;
	}
	/**
	 * @param sourceStation the sourceStation to set
	 */
	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}
	/**
	 * @return the destinationStation
	 */
	public String getDestinationStation() {
		return destinationStation;
	}
	/**
	 * @param destinationStation the destinationStation to set
	 */
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}
	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}
	/**
	 * @return the traveledSmardCard
	 */
	public String getTraveledSmardCard() {
		return traveledSmardCard;
	}
	/**
	 * @param traveledSmardCard the traveledSmardCard to set
	 */
	public void setTraveledSmardCard(String traveledSmardCard) {
		this.traveledSmardCard = traveledSmardCard;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	/**
	 * @return the travelFare
	 */
	public Double getTravelFare() {
		return travelFare;
	}
	/**
	 * @param travelFare the travelFare to set
	 */
	public void setTravelFare(Double travelFare) {
		this.travelFare = travelFare;
	}
	
	
	/**
	 * @return the cardCurrentBalance
	 */
	public Double getCardCurrentBalance() {
		return cardCurrentBalance;
	}
	/**
	 * @param cardCurrentBalance the cardCurrentBalance to set
	 */
	public void setCardCurrentBalance(Double cardCurrentBalance) {
		this.cardCurrentBalance = cardCurrentBalance;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TravelInfo [id=" + id + ", sourceStation=" + sourceStation + ", destinationStation="
				+ destinationStation + ", time=" + time + ", traveledSmardCard=" + traveledSmardCard + ", travelFare="
				+ travelFare + ", cardCurrentBalance=" + cardCurrentBalance + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardCurrentBalance == null) ? 0 : cardCurrentBalance.hashCode());
		result = prime * result + ((destinationStation == null) ? 0 : destinationStation.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((sourceStation == null) ? 0 : sourceStation.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((travelFare == null) ? 0 : travelFare.hashCode());
		result = prime * result + ((traveledSmardCard == null) ? 0 : traveledSmardCard.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof TravelInfo)) {
			return false;
		}
		TravelInfo other = (TravelInfo) obj;
		if (cardCurrentBalance == null) {
			if (other.cardCurrentBalance != null) {
				return false;
			}
		} else if (!cardCurrentBalance.equals(other.cardCurrentBalance)) {
			return false;
		}
		if (destinationStation == null) {
			if (other.destinationStation != null) {
				return false;
			}
		} else if (!destinationStation.equals(other.destinationStation)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (sourceStation == null) {
			if (other.sourceStation != null) {
				return false;
			}
		} else if (!sourceStation.equals(other.sourceStation)) {
			return false;
		}
		if (time == null) {
			if (other.time != null) {
				return false;
			}
		} else if (!time.equals(other.time)) {
			return false;
		}
		if (travelFare == null) {
			if (other.travelFare != null) {
				return false;
			}
		} else if (!travelFare.equals(other.travelFare)) {
			return false;
		}
		if (traveledSmardCard == null) {
			if (other.traveledSmardCard != null) {
				return false;
			}
		} else if (!traveledSmardCard.equals(other.traveledSmardCard)) {
			return false;
		}
		return true;
	}
	
	
}
