package com.homework.hibernate.query_results;

import com.homework.hibernate.QueryResult;
import com.homework.hibernate.db_model.DwdStoragegroup;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Sasha on 09.04.17.
 */
public class AllStorageGroups extends QueryResult {
	public AllStorageGroups(List content) {
		super(content);
	}

	@Override
	public void Print() {
		System.out.println("Table StorageGroups");
		Iterator it = this.content.iterator();
		while(it.hasNext()) {
			DwdStoragegroup sg = (DwdStoragegroup)it.next();
			String row = "|key: " + sg.getStoragegroupkey() +
						" |createdate: " + sg.getCreatedate() +
						" |id: " + sg.getStoragegroupid();
			System.out.println(row);
		}
		System.out.println();
	}
}
