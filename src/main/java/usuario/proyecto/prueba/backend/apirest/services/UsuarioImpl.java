package usuario.proyecto.prueba.backend.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import usuario.proyecto.prueba.backend.apirest.dao.IUsuarioDao;
import usuario.proyecto.prueba.backend.apirest.entity.Usuario;


@Service
public class UsuarioImpl implements IUsuarioService{

	@Autowired
	private IUsuarioDao usuda;

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>) usuda.findAll();
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuarios) {
		return usuda.save(usuarios);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {
		return usuda.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		usuda.deleteById(id);

	}

}
