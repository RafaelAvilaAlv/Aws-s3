package usuario.proyecto.prueba.backend.apirest.services;

import java.util.List;

import usuario.proyecto.prueba.backend.apirest.entity.Usuario;

public interface IUsuarioService {
	public List< Usuario> findAll();
	public Usuario save(Usuario usuarios); 
	public Usuario findById(Long id);
	public void delete (Long id);
}
