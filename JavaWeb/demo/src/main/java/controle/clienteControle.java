package controle;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import modelo.ClientesModelo;
import repositorio.ClientesRepositorio;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class clienteControle {
	ClientesRepositorio rep;	
  @RequestMapping(value="/cliente", method = RequestMethod.GET)
  public @ResponseBody List<ClientesModelo> consultar(){
	return this.rep.findAll();  
  }
	
}
