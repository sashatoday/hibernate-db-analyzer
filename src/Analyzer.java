import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

/**
 * Created by Sasha on 08.04.17.
 */
public class Analyzer {

	public List getDirectors(Session session) {
		List results = null;
		String hql = "from DwdFedirector";
		results = session.createQuery(hql).list();
		return results;
	}

	public List getStorageGroups(Session session) {
		List results = null;
		String hql = "from DwdStoragegroup";
		results = session.createQuery(hql).list();
		return results;
	}

	public List findDirectors(Session session) {
		List results = null;
		String hql = "select d.fedirectorid from DwdFedirector d " +
					 "join DwfFedirectorR dr " +
					 "on d.fedirectorkey = dr.fedirectorkey " +
					 "and (dr.spmqueuedepcount7 != 0 or dr.spmqueuedepcount8 != 0 or dr.spmqueuedepcount9 != 0) " +
					 "group by d.fedirectorid";
		results = session.createQuery(hql).list();
		return results;
	}

	public List findIntervals(Session session) {
		List results = null;
		String hql = "select t.datestamp from DwdTimeNUtc t " +
					 "join DwfFedirectorR dr " +
					 "on dr.timekey = t.timekey " +
					 "and (dr.spmqueuedepcount7 != 0 or dr.spmqueuedepcount8 != 0 or dr.spmqueuedepcount9 != 0) " +
					 "group by t.datestamp " +
					 "order by t.datestamp asc";
		results = session.createQuery(hql).list();
		return results;
	}

	public List findSG(Session session) {
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
		return results;
	}
}
