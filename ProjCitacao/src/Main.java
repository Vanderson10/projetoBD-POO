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
		Pensador find = dao.find(Pensador.class, 1l);
		System.out.println(find.getNome());

		DAO<Usuario> dao1 = new DAO<Usuario>();
		Usuario u = new Usuario();
		u.setCpf(13201156400l);
		u.setEmail("araujovanderson223@gmail.com");
		u.setIdade(17l);
		u.setNome("vanderson");
		dao1.save(u);
		Usuario find1 = dao1.find(Usuario.class, 13201156400l);
		System.out.println(find1.getNome());

		DAO<Categoria> dao2 = new DAO<Categoria>();
		Categoria c = new Categoria();
		c.setId(3l);
		c.setNome("Filosofia");
		dao2.save(c);
		Categoria find2 = dao2.find(Categoria.class, 3l);
		System.out.println(find2.getNome());
		
		DAO<Citacao> dao3 = new DAO<Citacao>();
		Citacao ci = new Citacao();
		ci.setId(3l);
		ci.setDescricao("Filosofia");
		dao3.save(ci);
		Citacao find3 = dao3.find(Citacao.class, 4l);
		System.out.println(find3.getDescricao());
		
	}
}
