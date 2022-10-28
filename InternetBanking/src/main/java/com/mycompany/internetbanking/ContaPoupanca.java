package com.mycompany.internetbanking;

public class ContaPoupanca  extends Conta{
    private String juros;
    private double credito;
    private double debito;

    /**
     * @return the juros
     */
    public String getJuros() {
        return juros;
    }

    /**
     * @param juros the juros to set
     */
    public void setJuros(String juros) {
        this.juros = juros;
    }

    /**
     * @return the credito
     */
    public double getCredito() {
        return credito;
    }

    /**
     * @param credito the credito to set
     */
    public void setCredito(double credito) {
        this.credito = credito;
    }

    /**
     * @return the debito
     */
    public double getDebito() {
        return debito;
    }

    /**
     * @param debito the debito to set
     */
    public void setDebito(double debito) {
        this.debito = debito;
    }
}
