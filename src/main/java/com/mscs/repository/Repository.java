/**
 * 
 */
package com.mscs.repository;

import java.util.List;

/**
 * @author nstanwar
 *
 */
public interface Repository<T> {
	public T add(T a);
	public T get(String a);
	public List<T> getAll();
	public T update(T a);
}
