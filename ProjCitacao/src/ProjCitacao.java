import java.util.ArrayList;
import java.util.HashMap;

public interface ProjCitacao {
	
	public Citacao enviar(Citacao citacao, Usuario usuario);
	
	public Citacao avaliar(Citacao citacao, ArrayList<Citacao>avalia, HashMap<Citacao, Integer> avaliacoes);
	
	
	
	public Citacao registraCitacao (Citacao citacao) throws CitacaoInvalidoException;
	
	public Pensador registraPensador1 (Pensador pensador) throws PensadorInvalidoException;
	
	public Categoria registraCategoria1 (Categoria categoria) throws CategoriaInvalidoException;
	
	public Usuario registraUsuario1 (Usuario Usuario) throws UsuarioInvalidoException;
	
	 
	
	
	
	
	
	
}
