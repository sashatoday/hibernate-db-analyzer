package com.homework.hibernate;

import com.homework.hibernate.query_results.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by Sasha on 08.04.17.
 */
public class HibernateMainApp {

	public static void main (String [] args) {
		Analyzer analyzer = new Analyzer();

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();

			/* 1. Get all directors */
			AllDirectors directors = analyzer.GetAllDirectors(session);
			directors.Print();

			/* 2. Get all storagegroups */
			AllStorageGroups storagegroups = analyzer.GetAllStorageGroups(session);
			storagegroups.Print();

			/* 3. Find directors that have problems with queues*/
			ProblemDirectors dirIds = analyzer.FindProblemDirs(session);
			dirIds.Print();

			/* 4. Find intervals when queues have problems */
			ProblemIntervals intervals = analyzer.FindProblemIntervals(session);
			intervals.Print();

			/* 5. Find storagegroups that slow processing */
			SlowStorageGroups slowSGs = analyzer.FindSlowStorageGroups(session);
			slowSGs.Print();

			/* 6. Get list spmqueuedepcount7, spmqueuedepcount8 and spmqueuedepcount9
			 * of some director */
			String dirId = "FA-4D";
 			QueueLoading queueLoading = analyzer.GetQueueLoading(session, dirId);
			queueLoading.Print();

			/* 6. Get list spmreadrtcount6 and spmreadrtcount7 of some storagegroups */
			String sgId = "VHDC2DBESX_SG";
			StorageGroupLoading sgLoading = analyzer.GetSGLoading(session, sgId);
			sgLoading.Print();

			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.shutdown();
		}
	}
}
