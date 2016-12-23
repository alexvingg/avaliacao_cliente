package br.com.avaliacao.service;

import br.com.avaliacao.model.Cliente;
import java.util.List;

/**
 * Created by Usuário on 23/12/2016.
 */
public interface ClienteService {

    Cliente buscarCliente(Long codigoCliente);
    List<Cliente> buscarClientes();
    void salvarCliente(Cliente cliente);

}
