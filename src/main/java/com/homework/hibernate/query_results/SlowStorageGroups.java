package com.homework.hibernate.query_results;

import com.homework.hibernate.QueryResult;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Sasha on 09.04.17.
 */
public class SlowStorageGroups extends QueryResult {
	public SlowStorageGroups(List content) {
		super(content);
	}

	@Override
	public void Print() {
		System.out.println("List slow StorageGroups");
		Iterator it = this.content.iterator();
		while(it.hasNext()) {
			Object[] data = (Object [])it.next();
			System.out.println("|key: " + data[0] +
							" |id: " + data[1] +
							" |count failed intervals: " + data[2]);
		}
		System.out.println();
	}
}
