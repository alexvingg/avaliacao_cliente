package br.com.avaliacao.repository;

import br.com.avaliacao.model.Cliente;
import org.h2.store.Page;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Usuário on 23/12/2016.
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
