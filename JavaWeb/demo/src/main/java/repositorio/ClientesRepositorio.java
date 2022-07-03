package repositorio;
import org.springframework.data.repository.Repository;

import modelo.ClientesModelo;
import java.util.List;

public interface ClientesRepositorio extends Repository<ClientesModelo, Integer> {
	void save(ClientesModelo cliente);
	List<ClientesModelo> findAll();
	ClientesModelo findById_cliente( Integer id_cliente);
	void delete(ClientesModelo cliente);

}
