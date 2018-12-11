import java.util.ArrayList;
import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categoria implements ProjCitacao {
	
	//-----------------------------------POSSIVEIS THROWS----------------------------------------//
	
		@Override
		public Categoria registraCategoria1 (Categoria categoria) throws CategoriaInvalidoException {
			Categoria categoria1 = new Categoria();
			if(categoria1 == null || categoria1.isEmpty()) {
				throw new CategoriaInvalidoException();
			}
			return null;
		}
		
	//---------------------------------------------------------------------------------------------//	
	
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Id
	private long id;
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return (int) id;
	}
	public void setId(long l) {
		this.id = l;
	}
	@Override
	public String toString() {
		return "Categoria [nome=" + nome + ", id=" + id + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + id);
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
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
	public Pensador registraPensador1(Pensador pensador) throws PensadorInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Categoria registraCategoria(Categoria categoria) throws CategoriaInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void registraUsuario(Usuario Usuario) throws UsuarioInvalidoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario registraUsuario1(Usuario Usuario) throws UsuarioInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}
}
