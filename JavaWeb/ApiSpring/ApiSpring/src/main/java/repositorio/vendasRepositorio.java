package repositorio;
import org.springframework.data.repository.Repository;

import modelo.vendasModelo;
import java.util.List;

public interface vendasRepositorio extends Repository<vendasModelo, Integer>{
   void save(vendasModelo venda);
   List<vendasModelo> findAll();
   vendasModelo findByID(Integer id);
   void delete(vendasModelo venda);
}
