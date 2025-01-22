package open_closed_principle;

import java.util.List;

public class RolesService {

	
	public List<Permiso> tenerPermisos(Usuario usuario){
		return usuario.getPermisos();	
	}
	
}
