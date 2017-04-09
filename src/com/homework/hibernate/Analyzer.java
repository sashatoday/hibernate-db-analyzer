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

	public ProblemDirs FindProblemDirs(Session session) {
		List results = null;
		String hql = "select d.fedirectorid from DwdFedirector d " +
				"join DwfFedirectorR dr " +
				"on d.fedirectorkey = dr.fedirectorkey " +
				"and (dr.spmqueuedepcount7 != 0 or dr.spmqueuedepcount8 != 0 or dr.spmqueuedepcount9 != 0) " +
				"group by d.fedirectorid";
		results = session.createQuery(hql).list();
		return new ProblemDirs(results);
	}

	public ProblemIntervals FindProblemIntervals(Session session) {
		List results = null;
		String hql = "select t.datestamp from DwdTimeNUtc t " +
				"join DwfFedirectorR dr " +
				"on dr.timekey = t.timekey " +
				"and (dr.spmqueuedepcount7 != 0 or dr.spmqueuedepcount8 != 0 or dr.spmqueuedepcount9 != 0) " +
				"group by t.datestamp " +
				"order by t.datestamp asc";
		results = session.createQuery(hql).list();
		return new ProblemIntervals(results);
	}

	public SlowSG FindSlowStorageGroups(Session session) {
		List results = null;
		String hql = "select q1.storagegroupkey, storagegroupid, count(q1.storagegroupkey) repetitions from " +
				"(select distinct on (1) d1.timekey, sg1.storagegroupkey, (sg1.spmreadrttime6 + sg1.spmreadrttime7) readtime " +
				"from public.dwf_fedirector_r d1 " +
				"join public.dwf_storagegroup_r sg1 " +
				"on d1.timekey = sg1.timekey " +
				"and (spmqueuedepcount7 != 0 or spmqueuedepcount8 != 0 or spmqueuedepcount9 != 0) " +
				"order by 1, 3 desc, 2) q1 " +
				"join public.dwd_storagegroup sg3 " +
				"on q1.storagegroupkey=sg3.storagegroupkey " +
				"group by storagegroupid, q1.storagegroupkey " +
				"order by repetitions desc";
		results = session.createSQLQuery(hql).list();
		return new SlowSG(results);
	}
}
