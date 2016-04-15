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
public class Card implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -415454851089788440L;
	private String cardNo;
	private Date expireDate;
	private Double availableAmount;
	/**
	 * 
	 */
	public Card() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the cardNo
	 */
	public String getCardNo() {
		return cardNo;
	}
	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	/**
	 * @return the expireDate
	 */
	public Date getExpireDate() {
		return expireDate;
	}
	/**
	 * @param expireDate the expireDate to set
	 */
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	/**
	 * @return the availableAmount
	 */
	public Double getAvailableAmount() {
		return availableAmount;
	}
	/**
	 * @param availableAmount the availableAmount to set
	 */
	public void setAvailableAmount(Double availableAmount) {
		this.availableAmount = availableAmount;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Card [cardNo=" + cardNo + ", expireDate=" + expireDate + ", availableAmount=" + availableAmount + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((availableAmount == null) ? 0 : availableAmount.hashCode());
		result = prime * result + ((cardNo == null) ? 0 : cardNo.hashCode());
		result = prime * result + ((expireDate == null) ? 0 : expireDate.hashCode());
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
		if (!(obj instanceof Card)) {
			return false;
		}
		Card other = (Card) obj;
		if (availableAmount == null) {
			if (other.availableAmount != null) {
				return false;
			}
		} else if (!availableAmount.equals(other.availableAmount)) {
			return false;
		}
		if (cardNo == null) {
			if (other.cardNo != null) {
				return false;
			}
		} else if (!cardNo.equals(other.cardNo)) {
			return false;
		}
		if (expireDate == null) {
			if (other.expireDate != null) {
				return false;
			}
		} else if (!expireDate.equals(other.expireDate)) {
			return false;
		}
		return true;
	}

	
}
