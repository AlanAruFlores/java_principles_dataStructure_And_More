package open_closed_principle;

import java.util.List;

public class Admin extends Usuario {

	public Admin() {
		super(Rol.ADMIN,List.of(Permiso.ELIMINAR, Permiso.ACTUALIZAR, Permiso.ESCRIBIR, Permiso.ELIMINAR));
	}

}
