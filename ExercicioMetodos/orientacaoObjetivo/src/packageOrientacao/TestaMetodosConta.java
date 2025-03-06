/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packageOrientacao;

public class TestaMetodosConta {


    public static void main(String[] args) {
       
        //Referencia de um Objeto
        Conta c = new Conta();
        
        //Chamado o método deposita()
        c.deposita(1000);
        c.imprimeExtrato();
        
        c.saca(100);
        c.imprimeExtrato();
        
        //Armazenamento a resposta de um método em variavel
        double saldoDisponivel = c.consultaSaldoDisponivel();
        System.out.println("Saldo disponível: " + saldoDisponivel);
    }
    
}
