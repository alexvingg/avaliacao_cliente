package br.com.avaliacao.rest;

import br.com.avaliacao.model.Cliente;
import br.com.avaliacao.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Usuário on 23/12/2016.
 */
@RestController
public class AvailiacaoRestController {

    @Autowired
    private ClienteService clienteService;

    @RequestMapping(value = "/clientes", method = RequestMethod.GET)
    public ResponseEntity<List<Cliente>> buscarClientes(){
        return new ResponseEntity<List<Cliente>>(this.clienteService.buscarClientes(), HttpStatus.OK);
    }

    @RequestMapping(value = "/clientes/{codigoCliente}", method = RequestMethod.GET)
    public ResponseEntity<Cliente> buscarCliente(@PathVariable Long codigoCliente){
        return new ResponseEntity<Cliente>(this.clienteService.buscarCliente(codigoCliente), HttpStatus.OK);
    }

    @RequestMapping(value = "/clientes", method = RequestMethod.POST)
    public ResponseEntity salvarCliente(@RequestBody Cliente cliente){
        this.clienteService.salvarCliente(cliente);
        return new ResponseEntity(HttpStatus.OK);
    }
}
