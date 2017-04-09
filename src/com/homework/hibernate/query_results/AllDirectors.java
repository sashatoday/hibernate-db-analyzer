package com.homework.hibernate.query_results;

import com.homework.hibernate.QueryResult;
import com.homework.hibernate.db_model.DwdFedirector;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Sasha on 09.04.17.
 */
public class AllDirectors extends QueryResult {
	public AllDirectors(List<String> content) {
		super(content);
	}

	public void print(AllDirectors allDirectors) {
		System.out.println("Table Directors");
		Iterator it = allDirectors.GetContent().iterator();
		while(it.hasNext()) {
			DwdFedirector dir = (DwdFedirector)it.next();
			String row = "|key: " + dir.getFedirectorkey() +
					" |createdate: " + dir.getCreatedate() +
					" |id: " + dir.getFedirectorid();
			System.out.println(row);
		}
		System.out.println();
	}
}
