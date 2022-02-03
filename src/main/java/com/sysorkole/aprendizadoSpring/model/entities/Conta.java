package com.sysorkole.aprendizadoSpring.model.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Conta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long idConta;
    private double saldo;
    private String senha;
    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Conta(){}

    public Conta(Long id, long idConta, double saldo, String senha, Cliente cliente) {
        this.id = id;
        this.idConta = idConta;
        this.saldo = saldo;
        this.senha = senha;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getIdConta() {
        return idConta;
    }

    public void setIdConta(long idConta) {
        this.idConta = idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Nome: " + getCliente().getNome() +
                " CPF: " + getCliente().getCpf();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return idConta == conta.idConta && Double.compare(conta.saldo, saldo) == 0 && id.equals(conta.id) && senha.equals(conta.senha) && Objects.equals(cliente, conta.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idConta, saldo, senha, cliente);
    }
}
