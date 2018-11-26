import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Citacao {
	
	@Id
	private int id;
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="id_pensador")
	private Set<Pensador>autores;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Set<Categoria>categorias;
	
	
	
	
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
	public void setId(int id) {
		this.id = id;
	}
	public Set<Pensador> getAutores() {
		return autores;
	}
	public void setAutores(Set<Pensador> autores) {
		this.autores = autores;
	}
	public Set<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(Set<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autores == null) ? 0 : autores.hashCode());
		result = prime * result + ((categorias == null) ? 0 : categorias.hashCode());
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
		if (autores == null) {
			if (other.autores != null)
				return false;
		} else if (!autores.equals(other.autores))
			return false;
		if (categorias == null) {
			if (other.categorias != null)
				return false;
		} else if (!categorias.equals(other.categorias))
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
		return "Citacao [descricao=" + descricao + ", id=" + id + ", autores=" + autores + ", categorias=" + categorias
				+ "]";
	}
	
	
	

}
