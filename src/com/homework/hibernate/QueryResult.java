package com.homework.hibernate;

import java.util.List;

/**
 * Created by Sasha on 09.04.17.
 */
public abstract class QueryResult {
	private final List<String> content;

	public QueryResult(List<String> cont) {
		content = cont;
	}

	public List<String> GetContent() {
		return content;
	}
}
