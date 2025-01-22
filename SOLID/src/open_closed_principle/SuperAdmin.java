package open_closed_principle;

import java.util.List;

public class SuperAdmin extends Usuario {

	public SuperAdmin() {
		super(Rol.SUPER_ADMIN,List.of(Permiso.ELIMINAR, Permiso.ACTUALIZAR, Permiso.ESCRIBIR, Permiso.ELIMINAR));
	}
}
