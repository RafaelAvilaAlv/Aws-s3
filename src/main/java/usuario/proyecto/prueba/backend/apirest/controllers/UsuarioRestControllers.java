package usuario.proyecto.prueba.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import usuario.proyecto.prueba.backend.apirest.entity.Usuario;
import usuario.proyecto.prueba.backend.apirest.services.IUsuarioService;

@RestController
@CrossOrigin(origins = ("http://localhost:4200"))
@RequestMapping("/api")
public class UsuarioRestControllers {

	@Autowired
	private IUsuarioService usuarioService;

	@GetMapping("/usuario")
	public List<Usuario> index() {
		return usuarioService.findAll();
	}

	// Buscar Cliente por Id
	@GetMapping("/usuario/{id}")
	public Usuario show(@PathVariable Long id) {
		return usuarioService.findById(id);
	}

	@PostMapping("/usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usua) {
		return usuarioService.save(usua);

	}

	// Editar Cliente
	@PutMapping("/usuario/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usu, @PathVariable Long id) {
		Usuario usuarioAc = usuarioService.findById(id);
		usuarioAc.setNombre(usu.getNombre());
		usuarioAc.setClave(usu.getClave());
		usuarioAc.setEmail(usu.getEmail());
		usuarioAc.setEstado(usu.isEstado());

		return usuarioService.save(usuarioAc);
	}

	// Eliminar Cliente
	@DeleteMapping("/usuario/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		usuarioService.delete(id);
	}

}
