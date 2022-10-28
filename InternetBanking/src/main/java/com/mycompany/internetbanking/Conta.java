package com.mycompany.internetbanking;

public class Conta {
    private double saldo;
    private String numeroContaC;
    private int numeroAgenciaC;
    private double saldoAnterior;

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the numeroContaC
     */
    public String getNumeroContaC() {
        return numeroContaC;
    }

    /**
     * @param numeroContaC the numeroContaC to set
     */
    public void setNumeroContaC(String numeroContaC) {
        this.numeroContaC = numeroContaC;
    }

    /**
     * @return the numeroAgenciaC
     */
    public int getNumeroAgenciaC() {
        return numeroAgenciaC;
    }

    /**
     * @param numeroAgenciaC the numeroAgenciaC to set
     */
    public void setNumeroAgenciaC(int numeroAgenciaC) {
        this.numeroAgenciaC = numeroAgenciaC;
    }

    /**
     * @return the saldoAnterior
     */
    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    /**
     * @param saldoAnterior the saldoAnterior to set
     */
    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }
}
