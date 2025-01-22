package inversion_dependendency_principle;

public class UsuarioRepository {
	private Database database;
	
	public UsuarioRepository(Database database) {
		this.database = database;
	}
}
