import java.util.ArrayList;
import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pensador implements ProjCitacao {
	
	// -----------------------------------POSSIVEIS THROWS----------------------------------------//

	public Pensador registraPensador1 (Pensador pensador) throws PensadorInvalidoException {
		Pensador pensador1 = new Pensador();
		if (pensador1 == null || pensador1.isEmpty()) {
			throw new PensadorInvalidoException();
		}
		return null;
	}
	//----------------------------------------------------------------------------------------------//


	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Id
	private long id;
	private String nome;

	@Override
	public int hashCode() {
		final int prime = 31;
		long result = 1;
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return (int) result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pensador other = (Pensador) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public void setId(long l) {
		this.id = l;
	}

	@Override
	public String toString() {
		return "Pensador [nome=" + nome + ", id=" + id + "]";
	}

	@Override
	public Citacao enviar(Citacao citacao, Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Citacao avaliar(Citacao citacao, ArrayList<Citacao> avalia, HashMap<Citacao, Integer> avaliacoes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Citacao registraCitacao(Citacao citacao) throws CitacaoInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registraPensador(Pensador pensador) throws PensadorInvalidoException {
		// TODO Auto-generated method stub

	}

	@Override
	public void registraCategoria(Categoria categoria) throws CategoriaInvalidoException {
		// TODO Auto-generated method stub

	}

	@Override
	public void registraUsuario(Usuario Usuario) throws UsuarioInvalidoException {
		// TODO Auto-generated method stub

	}


	@Override
	public Categoria registraCategoria1(Categoria categoria) throws CategoriaInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Usuario registraUsuario1(Usuario Usuario) throws UsuarioInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

}
