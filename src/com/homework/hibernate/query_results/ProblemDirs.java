package com.homework.hibernate.query_results;

import com.homework.hibernate.QueryResult;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Sasha on 09.04.17.
 */
public class ProblemDirs extends QueryResult {
	public ProblemDirs(List<String> content) {
		super(content);
	}

	public void print(ProblemDirs dirIds) {
		System.out.println("List ProblemDirectors");
		Iterator it = dirIds.GetContent().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}
}
