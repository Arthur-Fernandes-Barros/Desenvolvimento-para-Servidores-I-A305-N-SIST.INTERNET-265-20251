package packageOrientacao;

public class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.salario = 2000;
        f1.nome = "Arthur Hernandes";
        
        f1.aumentaSalario(1000);

        Funcionario f2 = new Funcionario();

        f2.salario = 2500;
        f2.nome = "Arthur Fernandes";
        
        f2.aumentaSalario(2000);
        
        f1.imprimeInformações();    
        f2.imprimeInformações();    
        
        

      /*  System.out.println(f1.salario);
        System.out.println(f1.nome);
        
        System.out.println(f2.salario);
        System.out.println(f2.nome); */
    }

}
