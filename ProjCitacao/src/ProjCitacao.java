import java.util.ArrayList;
import java.util.HashMap;

public interface ProjCitacao {
	
	public Citacao enviar(Citacao citacao, Usuario usuario);
	
	public Citacao avaliar(Citacao citacao, ArrayList<Citacao>avalia, HashMap<Citacao, Integer> avaliacoes);
	
	public void registraCitacao (Citacao citacao);
	
	public void registraPensador (Pensador pensador);
	
	public void registraCategoria (Categoria categoria);
	
	public void registraUsuario (Usuario Usuario);
	
	 
	
	
	
	
	
	
}
