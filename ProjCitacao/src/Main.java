import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("academico");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Pensador p = new Pensador();
		p.setId(1);
		p.setNome("Bob Marley");

		em.persist(p);
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
}