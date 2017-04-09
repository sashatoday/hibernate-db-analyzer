package com.homework.hibernate;

import com.homework.hibernate.query_results.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by Sasha on 08.04.17.
 */
public class MainApp {

	public static void main (String [] args) {
		Analyzer analyzer = new Analyzer();

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();

			/* 1. Get all directors */
			AllDirectors directors = analyzer.GetAllDirectors(session);
			directors.print(directors);

			/* 2. Get all storagegroups */
			AllStorageGroups storagegroups = analyzer.GetAllStorageGroups(session);
			storagegroups.print(storagegroups);

			/* 3. Find directors that have problems with queues*/
			ProblemDirs dirIds = analyzer.FindProblemDirs(session);
			dirIds.print(dirIds);

			/* 4. Find intervals when queues have problems */
			ProblemIntervals intervals = analyzer.FindProblemIntervals(session);
			intervals.print(intervals);

			/* 5. Find storagegroups that slow processing */
			SlowSG slowSG = analyzer.FindSlowStorageGroups(session);
			slowSG.Print(slowSG);

			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.shutdown();
		}
	}
}
