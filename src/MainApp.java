import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Sasha on 08.04.17.
 */
public class MainApp {

	public static void main (String [] s) {
		Analyzer analyzer = new Analyzer();
		Printer printer = new Printer();

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();

			/* 1. Get all directors */
			List Directors = analyzer.getDirectors(session);
			printer.printAllDirectors(Directors);

			/* 2. Get all storagegroups */
			List StorageGroups = analyzer.getStorageGroups(session);
			printer.printAllStorageGroups(StorageGroups);

			/* 3. Find directors that have problems with queues*/
			List dirIds = analyzer.findDirectors(session);
			printer.printDirIds(dirIds);

			/* 4. Find intervals when queues have problems */
			List intervals = analyzer.findIntervals(session);
			printer.printIntervals(intervals);

			/* 5. Find storagegroups that slow processing */
			List slowSG = analyzer.findSG(session);
			printer.printSlowSG(slowSG);

			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		HibernateUtil.shutdown();
	}
}
