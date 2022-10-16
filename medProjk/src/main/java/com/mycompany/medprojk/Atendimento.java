package com.mycompany.medprojk;

public class Atendimento {
    private String nomeMedico;
    private String nomePaciente;
    private String procedimento;

    /**
     * @return the nomeMedico
     */
    public String getNomeMedico() {
        return nomeMedico;
    }

    /**
     * @param nomeMedico the nomeMedico to set
     */
    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    /**
     * @return the nomePaciente
     */
    public String getNomePaciente() {
        return nomePaciente;
    }

    /**
     * @param nomePaciente the nomePaciente to set
     */
    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    /**
     * @return the procedimento
     */
    public String getProcedimento() {
        return procedimento;
    }

    /**
     * @param procedimento the procedimento to set
     */
    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }
}
