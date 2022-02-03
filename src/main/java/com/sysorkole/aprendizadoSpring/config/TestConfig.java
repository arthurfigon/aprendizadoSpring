package com.sysorkole.aprendizadoSpring.config;

import com.sysorkole.aprendizadoSpring.model.entities.Cliente;
import com.sysorkole.aprendizadoSpring.model.entities.Conta;
import com.sysorkole.aprendizadoSpring.model.repositories.ClienteRepository;
import com.sysorkole.aprendizadoSpring.model.repositories.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ContaRepository contaRepository;

    @Override
    public void run(String... args) throws Exception {
        Cliente cliente1 = new Cliente(null, "Arthur", "12345678910", "Arthur@gmail.com","21 1234");
        Cliente cliente2 = new Cliente(null, "Kimberly", "12345678911", "Kimberly@gmail.com","21 5678");

        Conta conta1 = new Conta(null, 1L, 1000.0, "1234567", cliente1);
        Conta conta2 = new Conta(null, 1L, 1000.0, "1234567", cliente2);

        clienteRepository.saveAll(Arrays.asList(cliente1,cliente2));
        contaRepository.saveAll(Arrays.asList(conta1,conta2));
    }
}
