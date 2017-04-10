package com.homework.hibernate.query_results;

import com.homework.hibernate.QueryResult;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Sasha on 10.04.17.
 */
public class StorageGroupLoading extends QueryResult {
	public StorageGroupLoading(List content) {
		super(content);
	}

	@Override
	public void Print() {
		System.out.println("StorageGroup Loading Statistics");
		Iterator it = this.content.iterator();
		while(it.hasNext()) {
			Object[] data = (Object [])it.next();
			System.out.println("|time: " + data[0] +
							" |count6 : " + data[1] +
							" |count7: " + data[2]);
		}
		System.out.println();
	}
}
