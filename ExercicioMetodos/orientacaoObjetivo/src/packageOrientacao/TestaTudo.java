
package packageOrientacao;


public class TestaTudo {
    public static void main(String[] args) {

        Cliente c1 = new Cliente();

        c1.codigo = 1;
        c1.nome = "Marcos Costa";

        CartaoDeCredito cdc1 = new CartaoDeCredito();

        cdc1.numero = 1111;
        cdc1.dataDeValidade = "01/01/2025";

        Conta cc1 = new Conta();

        cc1.numero = 1234;
        cc1.saldo = 1000;
        cc1.limite = 500;

        Agencia a1 = new Agencia();
        a1.numero = 1234;

        System.out.println(c1.codigo);
        System.out.println(c1.nome);
        System.out.println(cdc1.numero);
        System.out.println(cdc1.dataDeValidade);
        System.out.println(cc1.numero);
        System.out.println(cc1.saldo);
        System.out.println(cc1.limite);
        System.out.println(a1.numero);
    }

}
