import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Created by Sasha on 08.04.17.
 */
public class HibernateUtil {

	private static SessionFactory sessionFactory = buildSessionFactory();

	protected static SessionFactory buildSessionFactory() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()
				.build();
		try {
			sessionFactory = new MetadataSources(registry)
					.buildMetadata()
					.buildSessionFactory();
		}
		catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
			throw new ExceptionInInitializerError("Initial SessionFactory failed" + e);
		}
		return sessionFactory;
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		try {
			sessionFactory.close();
			StandardServiceRegistryBuilder.destroy(sessionFactory.getSessionFactoryOptions().getServiceRegistry());
			//Seems like a bug, we need to explicitly destroy service registry
		}catch(Throwable t) {
			System.err.println("Exception while closing session factory: " + t);
		}
	}
}
