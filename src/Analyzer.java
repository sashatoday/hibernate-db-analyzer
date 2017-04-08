import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Sasha on 08.04.17.
 */
public class Analyzer {

	void showAllDirectors() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			List<Object []> directors = session.createSQLQuery("select fedirectorid, createdate from Dwd_Fedirector").list();
			//	List<Object []> directors2 = session.createQuery("from DwdFedirector").list();
			directors.forEach(p -> System.out.println("User id: "+p[0]));
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	void showAllStorageGroups() {

	}

	void findDirectors() {

	}

	void findSG() {

	}
}
