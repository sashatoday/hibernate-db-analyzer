import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

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
		String hql = "";
		results = session.createQuery(hql).list();
		return results;
	}
}
