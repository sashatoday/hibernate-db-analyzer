package com.homework.hibernate.query_results;

import com.homework.hibernate.QueryResult;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Sasha on 09.04.17.
 */
public class SlowSG extends QueryResult {
	public SlowSG(List<String> content) {
		super(content);
	}

	public void Print(SlowSG slowSG) {
		System.out.println("List slow StoraeGroups");
		Iterator it = slowSG.GetContent().iterator();
		while(it.hasNext()) {
			Object[] data = (Object [])it.next();
			System.out.println("|key: " + data[0] +
					" |id: " + data[1] +
					" |repetition: " + data[2]);
		}
		System.out.println();
	}
}
