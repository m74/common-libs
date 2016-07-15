package mixam.tools.parser1c;

import mixam.toolkit.ClassTools;
import mixam.webtools.Logger;

public abstract class Worker<E> {

	private Parser parser;
	private E entity;
	private String start, end;

	public Worker(String start, String end) {
		this.start = start;
		this.end = end;
	}

	public void setParser(Parser parser) {
		this.parser = parser;
	}

	protected Class<?> getEntityClass() {
		return ClassTools.findClassTypeParameter(getClass());
	}

	public abstract void handlePair(E entity, String key, String val)
			throws Exception;

	public void handlePair(String key, String val) throws Exception {
		if (key.equals(start)) {
			entity = createNewEntity();
		}

		if (key.equals(end)) {
			commit();
		}

		handlePair(entity, key, val);
	}

	public void commit() throws Exception {
		parser.clearCurrentHandler();
		commitEntity(entity);

		entity = null;
	}

	protected abstract void commitEntity(E entity) throws Exception;

	@SuppressWarnings("unchecked")
	protected E createNewEntity() throws Exception {
		E e = (E) getEntityClass().newInstance();
		Logger.debug(this, e);
		return e;
	};

	public void setStart(String start) {
		this.start = start;
	}

	public String getStart() {
		return start;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getEnd() {
		return end;
	}

}
