package com.mycompany.internetbanking;

public class Clientes {
    private String login;
    private String senha;
    private String name;
    private String enderenco;
    private String cpf;
    private String numeroConta;
    private int numeroAgencia;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the enderenco
     */
    public String getEnderenco() {
        return enderenco;
    }

    /**
     * @param enderenco the enderenco to set
     */
    public void setEnderenco(String enderenco) {
        this.enderenco = enderenco;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the numeroConta
     */
    public String getNumeroConta() {
        return numeroConta;
    }

    /**
     * @param numeroConta the numeroConta to set
     */
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     * @return the numeroAgencia
     */
    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    /**
     * @param numeroAgencia the numeroAgencia to set
     */
    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
