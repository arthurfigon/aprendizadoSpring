package com.sysorkole.aprendizadoSpring.model.resources;

import com.sysorkole.aprendizadoSpring.model.entities.Cliente;
import com.sysorkole.aprendizadoSpring.model.entities.Conta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/contas")
public class ContaResource {

    @GetMapping
    public ResponseEntity<Conta> findAll(){
        Conta conta = new Conta(1L, 1L, 30.00, "1234567", ClienteResource.clienteCriado);
        return ResponseEntity.ok().body(conta);
    }
}
