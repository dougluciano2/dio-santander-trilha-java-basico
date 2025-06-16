package service;

import model.Conta;
import model.Pessoa;

import java.util.Scanner;

public class AuxiliaryCaller {

    Scanner sc = new Scanner(System.in);

    Conta conta = new Conta();

    public String executar(){
        System.out.println("SEJA BEM VINDO AO BANCO DIO/SANTANDER!");
        System.out.println("Este programa vai criar sua conta!");
        System.out.println();
        System.out.print("Digite o número da conta: ");
        Integer numeroConta = sc.nextInt();
        System.out.print("Digite o número da agência: ");
        String agenciaConta = sc.next();
        System.out.print("Digite seu nome completo: ");
        String nomeCliente = sc.next();
        Pessoa cliente = new Pessoa(nomeCliente);

        conta.setNumeroConta(numeroConta);
        conta.setAgenciaConta(agenciaConta);
        conta.setCleinte(cliente);

        return "Olá " + conta.getCleinte() +
                ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.getAgenciaConta() + ", conta " + conta.getNumeroConta() +
                " e seu saldo " + conta.getSaldo() + " já está disponível para saque";
    }
}
