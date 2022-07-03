package repositorio;
import org.springframework.data.repository.Repository;

import modelo.usuariosModelo;
import java.util.List;

public interface usuariosRepositorio extends Repository<usuariosModelo, Integer>{
   void save(usuariosModelo usuarios);
   List<usuariosModelo> findAll();
   usuariosModelo findByID(Integer id);
   void delete(usuariosModelo usuarios);
}
