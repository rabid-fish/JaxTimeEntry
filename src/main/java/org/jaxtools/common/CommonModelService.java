package org.jaxtools.common;

import java.util.List;

public interface CommonModelService<T> {

	public List<T> list();
	public T read(Long id);
	public void insert(T item);
	public void update(T item);

}
