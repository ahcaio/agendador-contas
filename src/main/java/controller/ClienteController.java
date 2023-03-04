package controller;
import entity.Cliente;
import service.ClienteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping

public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/todos")
	public List<Cliente> findAllClientes(){
		return clienteService.findCliente();
	}
	
	@PostMapping("/create")
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteService.createCliente(cliente);
		
	}
	
	@DeleteMapping("/delete/id/{id}")
	public void deleteCliente(@PathVariable Long id) {
		clienteService.deleteCliente(id);
	}
	
	@PutMapping("/update")
	public void updateCliente (@RequestBody Cliente cliente) {
		clienteService.updateCliente(cliente);
	}
}
