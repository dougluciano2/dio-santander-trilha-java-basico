package model;

import java.util.Objects;

public class Conta {

    private Integer numeroConta;
    private String agenciaConta;
    private Double saldo;

    public Conta(){}

    public Conta(String agenciaConta, Integer numeroConta, Double saldo) {
        this.agenciaConta = agenciaConta;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getAgenciaConta() {
        return agenciaConta;
    }

    public void setAgenciaConta(String agenciaConta) {
        this.agenciaConta = agenciaConta;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agenciaConta='" + agenciaConta + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numeroConta, conta.numeroConta) && Objects.equals(agenciaConta, conta.agenciaConta) && Objects.equals(saldo, conta.saldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroConta, agenciaConta, saldo);
    }
}
