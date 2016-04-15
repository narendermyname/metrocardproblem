/**
 * 
 */
package com.mscs.exception;

/**
 * @author nstanwar
 *
 */
public class MSCSException extends RuntimeException {

	/**
	 * 
	 */
	public MSCSException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public MSCSException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public MSCSException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public MSCSException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public MSCSException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
