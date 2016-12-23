package br.com.avaliacao.service;

import br.com.avaliacao.model.Cliente;
import br.com.avaliacao.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Usuário on 23/12/2016.
 */
@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> buscarClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public void salvarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public Cliente buscarCliente(Long codigoCliente) {
        return clienteRepository.findOne(codigoCliente);
    }
}
