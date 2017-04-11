package com.homework.hibernate.query_results;

import com.homework.hibernate.QueryResult;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Sasha on 10.04.17.
 */
public class QueueLoading extends QueryResult {
	public QueueLoading(List content) {
		super(content);
	}

	@Override
	public void Print() {
		System.out.println("Queue Loading Statistics");
		Iterator it = this.content.iterator();
		while(it.hasNext()) {
			Object[] data = (Object [])it.next();
			System.out.println("|time: " + data[0] +
							" |count7: " + data[1] +
							" |count8: " + data[2] +
							" |count9: " + data[3]);
		}
		System.out.println();
	}
}
