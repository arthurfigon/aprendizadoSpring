package com.sysorkole.aprendizadoSpring.model.resources;

import com.sysorkole.aprendizadoSpring.model.entities.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @GetMapping
    public ResponseEntity<Cliente> findAll(){
        Cliente cliente = new Cliente(1L, "Arthur", "01234567891", "arthur@gmail.com", "21 99999-9999");
        return ResponseEntity.ok().body(cliente);
    }
}
