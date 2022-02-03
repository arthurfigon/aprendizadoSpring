package com.sysorkole.aprendizadoSpring.model.repositories;

import com.sysorkole.aprendizadoSpring.model.entities.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {
}
