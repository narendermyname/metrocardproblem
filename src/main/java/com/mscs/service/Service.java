/**
 * 
 */
package com.mscs.service;

import java.util.List;

/**
 * @author nstanwar
 *
 */
public interface Service<T> {
	
	public T add(T a);
	public T get(String a);
	public List<T> getAll();
}
