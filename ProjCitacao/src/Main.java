import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("academico");
		EntityManager em = factory.createEntityManager();
		
		DAO<Pensador> dao = new DAO<Pensador>();
		Pensador p = new Pensador();
		p.setId(1l);
		p.setNome("Bob Marley");
		dao.save(p);
		
		Pensador p2 = new Pensador();
		p2.setId(2l);
		p2.setNome("Barack obama");
		dao.save(p2);
		Pensador find = dao.find(Pensador.class, 2l);
		System.out.println(find.getNome());
	}
		}
		
	