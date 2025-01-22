package open_closed_principle;

import java.util.List;

public class Usuario {
	private Integer id;
	private String nombre;
	private Rol rol;
	private List<Permiso> permisos;
	
	
	public Usuario() {
		this(Rol.USUARIO, List.of(Permiso.ACTUALIZAR));
	}
	
	public Usuario(Rol rol, List<Permiso> permisos) {
		super();
		this.rol = rol;
		this.permisos = permisos;
	}
	
	
	

	public List<Permiso> getPermisos() {
		return permisos;
	}
	
	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}

	
}
