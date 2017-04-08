import db_model.DwdFedirector;
import db_model.DwdStoragegroup;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Sasha on 08.04.17.
 */
public class Printer {

	public void printAllDirectors(List allDirectors) {
		System.out.println("Table Directors");
		Iterator it = allDirectors.iterator();
		while(it.hasNext()) {
			DwdFedirector dir = (DwdFedirector)it.next();
			String row = "|key: " + dir.getFedirectorkey() +
						 " |createdate: " + dir.getCreatedate() +
						 " |id: " + dir.getFedirectorid();
			System.out.println(row);
		}
		System.out.println();
	}

	public void printAllStorageGroups (List allDirectors) {
		System.out.println("Table StorageGroups");
		Iterator it = allDirectors.iterator();
		while(it.hasNext()) {
			DwdStoragegroup sg = (DwdStoragegroup)it.next();
			String row = "|key: " + sg.getStoragegroupkey() +
						 " |createdate: " + sg.getCreatedate() +
						 " |id: " + sg.getStoragegroupid();
			System.out.println(row);
		}
		System.out.println();
	}

	public void printDirIds(List dirIds) {
		System.out.println("List DirectorsId");
		Iterator it = dirIds.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}

	public void printIntervals(List intervals) {
		System.out.println("List Intervals");
		Iterator it = intervals.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}

}
