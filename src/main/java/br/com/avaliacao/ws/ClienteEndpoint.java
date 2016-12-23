package br.com.avaliacao.ws;

import br.com.avaliacao.service.ClienteService;

import io.avaliacao.interno.avaliacao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by Usuário on 23/12/2016.
 */
@Endpoint
public class ClienteEndpoint {

    private static final String NAMESPACE_URI = "http://interno.avaliacao.io/avaliacao";

    @Autowired
    private ClienteService clienteService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getClienteRequest")
    @ResponsePayload
    public GetClienteResponse getCliente(@RequestPayload GetClienteRequest request) {
        GetClienteResponse response = new GetClienteResponse();
        br.com.avaliacao.model.Cliente cli = clienteService.buscarCliente(request.getCodigoCliente());
        Cliente cliente = new Cliente();

        if(null != cli){
            cliente.setCodigoCliente(cli.codigoCliente);
            cliente.setCpfCliente(cli.cpfCliente);
            cliente.setNomeCliente(cli.nomeCliente);
        }

        response.setCliente(cliente);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "saveClienteRequest")
    @ResponsePayload
    public GetClienteResponse saveCliente(@RequestPayload SaveClienteRequest request) {
        GetClienteResponse response = new GetClienteResponse();
        br.com.avaliacao.model.Cliente cli = new br.com.avaliacao.model.Cliente();
        cli.nomeCliente = request.getNomeCliente();
        cli.cpfCliente = request.getCpfCliente();
        clienteService.salvarCliente(cli);

        Cliente cliente = new Cliente();
        cliente.setCodigoCliente(cli.codigoCliente);
        cliente.setCpfCliente(cli.cpfCliente);
        cliente.setNomeCliente(cli.nomeCliente);
        response.setCliente(cliente);

        return response;
    }

}
