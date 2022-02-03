package com.sysorkole.aprendizadoSpring.model.repositories;

import com.sysorkole.aprendizadoSpring.model.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
