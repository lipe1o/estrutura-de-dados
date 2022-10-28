package com.mycompany.internetbanking;

public class ContaCorrente extends Conta{
    private double chuqueEspecial;
    private double cpmf;
    private String dataVencimentoCheque;

    /**
     * @return the chuqueEspecial
     */
    public double getChuqueEspecial() {
        return chuqueEspecial;
    }

    /**
     * @param chuqueEspecial the chuqueEspecial to set
     */
    public void setChuqueEspecial(double chuqueEspecial) {
        this.chuqueEspecial = chuqueEspecial;
    }

    /**
     * @return the cpmf
     */
    public double getCpmf() {
        return cpmf;
    }

    /**
     * @param cpmf the cpmf to set
     */
    public void setCpmf(double cpmf) {
        this.cpmf = cpmf;
    }

    /**
     * @return the dataVencimentoCheque
     */
    public String getDataVencimentoCheque() {
        return dataVencimentoCheque;
    }

    /**
     * @param dataVencimentoCheque the dataVencimentoCheque to set
     */
    public void setDataVencimentoCheque(String dataVencimentoCheque) {
        this.dataVencimentoCheque = dataVencimentoCheque;
    }
}
