import java.util.Set;
import java.util.HashMap;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Usuario {
	
	@Id
	private long cpf;
	private String email;
	private int idade;
	private String nome;
	
	@ManyToMany
	@JoinTable(
			name = "Usuario_Cita",
			joinColumns = @JoinColumn(name = "citação_id"),
			inverseJoinColumns = @JoinColumn(name = "usuario_id"))
	private Set<Citacao>visualiza;
	
	@ManyToMany 
	@JoinTable(
			name = "Avalia_citação",
			joinColumns = @JoinColumn(name = "citação_id"),
			inverseJoinColumns = @JoinColumn(name = "avalia_id"))
	private Set<Citacao>avalia;
	
	private HashMap<Citacao, Integer> avaliacoes;
	
	//--------------------------------GET E SETS----------------------------------------------//
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public Set<Citacao> getVisualiza() {
		return visualiza;
	}
	public void setVisualiza(Set<Citacao> visualiza) {
		this.visualiza = visualiza;
	}
	public Set<Citacao> getAvalia() {
		return avalia;
	}
	public void setAvalia(Set<Citacao> avalia) {
		this.avalia = avalia;
	}
	public Usuario(String email, int idade, String nome, long cpf, Set<Citacao> visualiza,
			Set<Citacao> avalia) {
		super();
		this.email = email;
		this.idade = idade;
		this.nome = nome;
		this.cpf = cpf;
		this.visualiza = visualiza;
		this.avalia = avalia;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((avalia == null) ? 0 : avalia.hashCode());
		result = prime * result + ((avaliacoes == null) ? 0 : avaliacoes.hashCode());
		result = prime * result + (int) (cpf ^ (cpf >>> 32));
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((visualiza == null) ? 0 : visualiza.hashCode());
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
		Usuario other = (Usuario) obj;
		if (avalia == null) {
			if (other.avalia != null)
				return false;
		} else if (!avalia.equals(other.avalia))
			return false;
		if (avaliacoes == null) {
			if (other.avaliacoes != null)
				return false;
		} else if (!avaliacoes.equals(other.avaliacoes))
			return false;
		if (cpf != other.cpf)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (visualiza == null) {
			if (other.visualiza != null)
				return false;
		} else if (!visualiza.equals(other.visualiza))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Usuario [email=" + email + ", idade=" + idade + ", nome=" + nome + ", cpf=" + cpf + ", visualiza="
				+ visualiza + ", avalia=" + avalia + "]";
	}
	public HashMap<Citacao, Integer> getAvaliacoes() {
		return avaliacoes;
	}
	public void setAvaliacoes(HashMap<Citacao, Integer> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

}
