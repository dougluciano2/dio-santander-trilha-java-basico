package model;

import java.util.Objects;

public class Conta {

    private Integer numeroConta;
    private String agenciaConta;
    private Double saldo;
    private final  Double SALDO_INICIAL = 370.0;

    private Pessoa cleinte;

    public Conta(){
        this.saldo = SALDO_INICIAL;
    }

    public Conta(String agenciaConta, Pessoa cleinte, Integer numeroConta) {
        this.agenciaConta = agenciaConta;
        this.cleinte = cleinte;
        this.numeroConta = numeroConta;
        this.saldo = SALDO_INICIAL;
    }


    public String getAgenciaConta() {
        return agenciaConta;
    }

    public void setAgenciaConta(String agenciaConta) {
        this.agenciaConta = agenciaConta;
    }

    public Pessoa getCleinte() {
        return cleinte;
    }

    public void setCleinte(Pessoa cleinte) {
        this.cleinte = cleinte;
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
                ", cleinte=" + cleinte +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numeroConta, conta.numeroConta) && Objects.equals(agenciaConta, conta.agenciaConta) && Objects.equals(saldo, conta.saldo) && Objects.equals(cleinte, conta.cleinte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroConta, agenciaConta, saldo, cleinte);
    }
}
