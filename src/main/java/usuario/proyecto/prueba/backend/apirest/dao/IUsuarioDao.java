package usuario.proyecto.prueba.backend.apirest.dao;

import org.springframework.data.repository.CrudRepository;

import usuario.proyecto.prueba.backend.apirest.entity.Usuario;


public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

}
