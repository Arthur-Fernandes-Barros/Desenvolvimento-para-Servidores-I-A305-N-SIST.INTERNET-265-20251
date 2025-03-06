
package packageOrientacao;

public class Funcionario {
    
    String nome;
    double salario;
    
     void aumentaSalario(double aumento) {
        this.salario += aumento;
    }
     
        void imprimeInformações() {
        System.out.println("Informações: " + this.nome + " " + this.salario );
    }
}
