package fila;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class Fila {

    public static void main(String[] args) {
        Queue<Contatos> fila=new LinkedList();
        Contatos contatos=new Contatos();
        boolean run=true;
        while(run){
        int x=Integer.parseInt(JOptionPane.showInputDialog("1-Inserir contato\n2-Próximo contato\n\n 0- Sair"));
        if(x==1){
            contatos.setNome(JOptionPane.showInputDialog("Coloque o nome"));
            contatos.setNumeroTelefone(JOptionPane.showInputDialog("Coloque o número de telefone do cliente"));
            contatos.setEndereco(JOptionPane.showInputDialog("Coloque o endereço do cliente"));
            contatos.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Coloque o cpf do cliente")));
            fila.add(contatos);
        }if(x==2){
            Contatos c= fila.element();
            JOptionPane.showMessageDialog(null, c.getNome()+"\n"+c.getEndereco()+"\n"+c.getNumeroTelefone()+"\n"+c.getCpf());
            fila.poll();
            
        }else if(x==0){
            run=!run;
        }else if((x!=0)&(x!=1)&(x!=2)&(x!=3)){
            run=run;
        }
        }        
    }    
}
