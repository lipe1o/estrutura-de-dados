package com.mycompany.medprojk;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class MedProjk {

    public static void main(String[] args) {
        //lista de pacientes e medicos, respectivamente
        ArrayList<Pacientes> pacientes=new ArrayList();
        ArrayList<Medicos> medicos=new ArrayList();
        
        //fila de atentendimento 
        Queue<Atendimento> atendimento=new LinkedList();
        
        //pilha do recolhimento dos malotes
        Stack<Malotes> malotes=new Stack();
             
        //Estancias de classes
        Pacientes paci=new Pacientes();
        Medicos med=new Medicos();
        Procedimentos pro=new Procedimentos();
        Atendimento aten=new Atendimento();
        Malotes mala=new Malotes();
        //delcaração de variaveis
        int x,y;
        boolean run=true;
        while(run){
            x=Integer.parseInt(JOptionPane.showInputDialog("1-registrar paciente\n2-registrar méicos\n3-registrar atendimento\n4-atendimento atual\n5-próximo atendimento\n6-Colocar a ordedm de entrega dos maltoes\n7-Recolhimento dos malotes\n\n0-SAIR"));
            if(x==0){
                run=false;
            }if(x==1){
                paci.setNome(JOptionPane.showInputDialog("Nome Completo"));
                paci.setTelefone(JOptionPane.showInputDialog("Número de telefone"));
                paci.setEmail(JOptionPane.showInputDialog("Email "));
                paci.setDataNascimento(JOptionPane.showInputDialog("Data de nascimento(dd/mm/aaaa)"));
                paci.setSexo(JOptionPane.showInputDialog("Sexo(M/F)"));
                pacientes.add(paci);
            }if(x==2){
                med.setNome(JOptionPane.showInputDialog("Nome completo"));
                med.setTelefone(JOptionPane.showInputDialog("número de telefone"));
                med.setEmail(JOptionPane.showInputDialog("Email"));
                med.setEspecializacao(JOptionPane.showInputDialog("Especialização"));
                med.setCrm(JOptionPane.showInputDialog("CRM"));
                medicos.add(med);
            }if(x==3){
                aten.setNomeMedico(JOptionPane.showInputDialog("Nome do médico"));
                aten.setNomePaciente(JOptionPane.showInputDialog("Nome do paciente"));
                aten.setProcedimento(JOptionPane.showInputDialog("Procedimento"));
                atendimento.add(aten);
            }if(x==4)JOptionPane.showInputDialog(atendimento.element());
            if(x==5)atendimento.poll();
            if(x==6){
                mala.setFilial(JOptionPane.showInputDialog("Filial"));
                malotes.add(mala);
            }
            if(x==7)malotes.peek();
        }
    }
}