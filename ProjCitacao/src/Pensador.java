import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pensador implements Identificavel {
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
	

}
