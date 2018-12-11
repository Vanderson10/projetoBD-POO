import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Citacao implements ProjCitacao {
	
	@Id
	private int id;
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="id_pensador")
	private Pensador autor;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria categoria;
	
	//-----------------------------------POSSIVEIS THROWS----------------------------------------//
	
	@Override
	public Citacao registraCitacao(Citacao citacao) throws CitacaoInvalidoException {
		Citacao citacao1 = new Citacao();
		if(citacao1 == null || citacao1.isEmpty()) {
			throw new CitacaoInvalidoException();
		}
		return null;

	}

	
	//--------------------------------GET E SETS----------------------------------------------//
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getId() {
		return id;
	}
	public void setId(long l) {
		this.id = (int) l;
	}
	public Pensador getAutor() {
		return autor;
	}
	public void setAutor(Pensador autor) {
		this.autor = autor;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + id;
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
		Citacao other = (Citacao) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;

		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Citacao [descricao=" + descricao + ", id=" + id + ", autores=" + autor + "]";
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
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
	public Pensador registraPensador1(Pensador pensador) throws PensadorInvalidoException {
		// TODO Auto-generated method stub
		return null;
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
