package com.homework.hibernate.query_results;

import com.homework.hibernate.QueryResult;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Sasha on 09.04.17.
 */
public class ProblemIntervals extends QueryResult {
	public ProblemIntervals(List content) {
		super(content);
	}

	@Override
	public void Print() {
		System.out.println("List ProblemIntervals");
		Iterator it = this.content.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}
}