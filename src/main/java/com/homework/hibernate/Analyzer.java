package com.homework.hibernate;

import com.homework.hibernate.query_results.*;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Sasha on 08.04.17.
 */
public class Analyzer {

	public AllDirectors GetAllDirectors(Session session) {
		List results = null;
		String hql = "from DwdFedirector";
		results = session.createQuery(hql).list();
		return new AllDirectors(results);
	}

	public AllStorageGroups GetAllStorageGroups(Session session) {
		List results = null;
		String hql = "from DwdStoragegroup";
		results = session.createQuery(hql).list();
		return new AllStorageGroups(results);
	}

	public ProblemDirectors FindProblemDirs(Session session) {
		List results = null;
		String hql = "select d.fedirectorid from DwdFedirector d " +
				"join DwfFedirectorR dr " +
				"on d.fedirectorkey = dr.fedirectorkey " +
				"and (dr.spmqueuedepcount7 != 0 or " +
					"dr.spmqueuedepcount8 != 0 or dr.spmqueuedepcount9 != 0) " +
				"group by d.fedirectorid";
		results = session.createQuery(hql).list();
		return new ProblemDirectors(results);
	}

	public ProblemIntervals FindProblemIntervals(Session session) {
		List results = null;
		String hql = "select t.datestamp from DwdTimeNUtc t " +
				"join DwfFedirectorR dr " +
				"on dr.timekey = t.timekey " +
				"and (dr.spmqueuedepcount7 != 0 or " +
					"dr.spmqueuedepcount8 != 0 or dr.spmqueuedepcount9 != 0) " +
				"group by t.datestamp " +
				"order by t.datestamp asc";
		results = session.createQuery(hql).list();
		return new ProblemIntervals(results);
	}

	public SlowStorageGroups FindSlowStorageGroups(Session session) {
		List results = null;
		String hql = "select q.storagegroupkey, storagegroupid, " +
						"count(q.storagegroupkey) count_failed_intervals " +
					"from (select distinct on (1) d.timekey, sg1.storagegroupkey, " +
						"(sg1.spmreadrttime6 + sg1.spmreadrttime7) readtime " +
						"from public.dwf_fedirector_r d " +
						"join public.dwf_storagegroup_r sg1 " +
						"on d.timekey = sg1.timekey " +
							"and (spmqueuedepcount7 != 0 or spmqueuedepcount8 != 0 " +
								"or spmqueuedepcount9 != 0) " +
						"order by 1, 3 desc, 2) q " +
					"join public.dwd_storagegroup sg2 " +
					"on q.storagegroupkey=sg2.storagegroupkey " +
					"group by storagegroupid, q.storagegroupkey " +
					"order by count_failed_intervals desc";
		results = session.createSQLQuery(hql).list();
		return new SlowStorageGroups(results);
	}

	public QueueLoading GetQueueLoading(Session session, String directorId)
	{
		List results = null;
		String hql = "select t.datestamp, dr.spmqueuedepcount7, " +
						"dr.spmqueuedepcount8, dr.spmqueuedepcount9 " +
					"from DwdFedirector d " +
					"join DwfFedirectorR dr " +
					"on d.fedirectorkey = dr.fedirectorkey " +
						"and d.fedirectorid = :dirId " +
					"join DwdTimeNUtc t " +
					"on dr.timekey = t.timekey " +
					"group by t.datestamp,dr.spmqueuedepcount7, " +
						"dr.spmqueuedepcount8, dr.spmqueuedepcount9 " +
					"order by t.datestamp";
		results = session.createQuery(hql).setParameter("dirId", directorId).list();
		return new QueueLoading(results);
	}

	public StorageGroupLoading GetSGLoading(Session session, String sgId)
	{
		List results = null;
		String hql = "select t.datestamp, sgr.spmreadrtcount6, " +
						"sgr.spmreadrtcount7 " +
					"from DwdStoragegroup sg " +
					"join DwfStoragegroupR sgr " +
					"on sg.storagegroupkey=sgr.storagegroupkey " +
						"and sg.storagegroupid = :sgId " +
					"join DwdTimeNUtc t " +
					"on sgr.timekey = t.timekey " +
					"group by t.datestamp, sgr.spmreadrtcount6, " +
						"sgr.spmreadrtcount7 " +
					"order by t.datestamp";
		results = session.createQuery(hql).setParameter("sgId", sgId).list();
		return new StorageGroupLoading(results);
	}
}
