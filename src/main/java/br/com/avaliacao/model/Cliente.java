package br.com.avaliacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Usuário on 23/12/2016.
 */
@Entity(name = "cliente")
public class Cliente {

    @Id
    @Column(name = "codigo_cliente")
    @GeneratedValue
    public Long codigoCliente;

    @Column(name = "nome_cliente")
    public String nomeCliente;

    @Column(name = "cpf_cliente")
    public String cpfCliente;

}
