/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packageOrientacao;

public class TestaCliente {


    public static void main(String[] args) {
   
        Cliente c1 = new Cliente (); 
        
        c1.codigo = 1;
        c1.nome = "Marcos Costa";
        
        Cliente c2 = new Cliente();
        
        c2.codigo = 2;
        c2.nome = "Satanas Lucifer";
        
        System.out.println(c1.codigo);
        System.out.println(c1.nome);
        
        System.out.println(c2.codigo);
        System.out.println(c2.nome);
        
    }
    
}
