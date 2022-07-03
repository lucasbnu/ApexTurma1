package repositorio;
import org.springframework.data.repository.Repository;

import modelo.produtosModelo;
import java.util.List;

public interface ProdutosRepositorio extends Repository<produtosModelo, Integer>{
   void save(produtosModelo produto);
   List<produtosModelo> findAll();
   produtosModelo findByID(Integer id);
   void delete(produtosModelo produto);
}