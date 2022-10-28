package com.mycompany.internetbanking;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class InternetBanking {
    
    public static void main(String[] args) {
        Clientes cliente=new Clientes();
        Conta conta=new Conta();
        ArrayList<Clientes> listaClientes=new ArrayList();
        boolean run=true,run2=true,run3=true;
        int x;
        double valor;
        String cont;
        while(run){
            x=Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar na XYZ Agency\n2-Extrato\n2-Transações\n\n0-Sair"));
            if(x==0){
                run=false;
            }if(x==1){
                cliente.setLogin(JOptionPane.showInputDialog("Login:"));
                cliente.setSenha(JOptionPane.showInputDialog("senha:"));
                cliente.setName(JOptionPane.showInputDialog("Nome:"));
                cliente.setCpf(JOptionPane.showInputDialog("CPF:"));
                cliente.setEnderenco(JOptionPane.showInputDialog("Endereço:"));
                cliente.setNumeroAgencia(Integer.parseInt(JOptionPane.showInputDialog("Número da Agencia(apenas numeros):")));
                cliente.setNumeroConta(JOptionPane.showInputDialog("Número da Conta:"));
                listaClientes.add(cliente);
            }if(x==2){
                while(run2){
                    int y=Integer.parseInt(JOptionPane.showInputDialog("1-Extrato conta corrente\n2-Extrato conta poupança\n\n0-SAIR"));
                    if(y==0){
                        run2=false;
                    }if(y==1){
                        
                    }if(y==2){
                        
                    }
                }
            }if(x==3){
                while(run3){
                    int y=Integer.parseInt(JOptionPane.showInputDialog("1-Deposito\n2-Transferencia\n3-Saque\n4-pagamento\n5-Saldo\n\n0-SAIR"));
                    if(y==0){
                        run3=false;
                    }if(y==1){
                        valor=Integer.parseInt(JOptionPane.showInputDialog(null, "valor do deposito"));
                        conta.setSaldo(conta.getSaldo()+valor);
                    }if(y==2){                        
                        valor=Integer.parseInt(JOptionPane.showInputDialog(null, "valor do Transferencia"));
                        cont=JOptionPane.showInputDialog("numero da conta");
                        conta.getNumeroContaC();
                        conta.setSaldo(conta.getSaldo()-valor);                   
                    }if(y==3){
                        valor=Integer.parseInt(JOptionPane.showInputDialog(null, "valor do Saque"));
                        conta.setSaldo(conta.getSaldo()-valor);
                    }if(y==4){
                        valor=Integer.parseInt(JOptionPane.showInputDialog(null, "valor do Pagamento"));
                        conta.setSaldo(conta.getSaldo()-valor);
                    }if(y==5){
                        JOptionPane.showMessageDialog(null, conta.getSaldo());
                    }
                }
            }if(x==4){
                
            }
        }
    }
}

