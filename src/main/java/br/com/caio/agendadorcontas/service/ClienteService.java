package br.com.caio.agendadorcontas.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.caio.agendadorcontas.entity.Cliente;

@Service
/**
 * O @Service marca uma classe Java que executa algum serviço, 
 * como executar lógica de negócios, executar cálculos e chamar APIs externas.
 * @author caio
 *
 */
public class ClienteService {
	
	List<Cliente> objeto = new ArrayList<>();
	
	/**
	 * Método responsável por adicionar um cliente na lista, simulando a criação de um usuário na base da dados
	 */
	public Cliente createCliente(Cliente cliente) {
		objeto.add(cliente);
		return objeto.get(0);
	}
	
	
	/**
	 *  Método responsável por criar um alista de clientes, simulando um banco de dados
	 */
	public List<Cliente> findCliente(){
		return objeto;
	}
	
	
	/**
	 * Método responsável por deletar um cliente na lista, simulando um delete de um usuário na base de dados
	 */
	public void deleteCliente(long id) {
		for (Cliente cliente: objeto) {
			if (cliente.getId() ==id)
				objeto.remove(cliente);
			break;
		}
	}
	
	
	/**
	 * Método responsável por atualizare informações de um cliente na lista, simulando um update de um usuário na base de dados.
	 */
	public void updateCliente(Cliente cliente) {
		for (Cliente c: objeto) {
			if (cliente.getId() == c.getId())
				deleteCliente(cliente.getId());
				createCliente(cliente);
				break;
		}
		
	}
}
