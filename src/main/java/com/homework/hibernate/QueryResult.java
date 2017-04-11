package com.homework.hibernate;

import java.util.List;
import java.util.Objects;

/**
 * Created by Sasha on 09.04.17.
 */
public abstract class QueryResult {
	protected final List content;

	public QueryResult(List cont) {
		content = cont;
	}

	public List GetContent()
	{
		return content;
	}

	public abstract void Print();

}
