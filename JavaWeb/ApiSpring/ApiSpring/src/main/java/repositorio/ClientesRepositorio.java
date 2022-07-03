package repositorio;
import org.springframework.data.repository.Repository;

import modelo.ClientesModelo;
import java.util.List;

public interface ClientesRepositorio extends Repository<ClientesModelo, Integer>{
   void save(ClientesModelo cliente);
   List<ClientesModelo> findAll();
   ClientesModelo findByID(Integer id);
   void delete(ClientesModelo clinte);
}
