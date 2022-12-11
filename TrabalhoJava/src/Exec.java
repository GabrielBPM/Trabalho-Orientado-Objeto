import javax.swing.*;

public class Exec {
    public static void main(String[] args) {

        Endereço cep1 = new Endereço("040360-72", "Palimondas", "45", "403", "Belo Horizonte", "Minas Gerais");
        Endereço cep2 = new Endereço("040210-72", "Flores", "21", "201", "São Paulo", "Minas Gerais");
        Endereço cep3 = new Endereço("040782-72", "Bom Jardim", "32", "102", "Rio de Janeiro", "Rio de Janeiro");

        Cliente cl1 = new Cliente("275.801.382-49", "Paulo", "37988884782");
        cl1.listaEndereço.add(cep1);
        cl1.listaEndereço.add(cep2);
        cl1.listaEndereço.add(cep3);

        cl1.imprimirEndereco(cl1);
 //====================================================================================================================================================================
        Cargo ger = new Cargo();
        ger.setNome("gerente");

        Cargo atend = new Cargo();
        atend.setNome("atendente");

        Funcionário func1 = new Funcionário("801.733.245-72","Marcio","923781635",3200.);
        func1.setCargoFuncionário(ger);

        Funcionário func2 = new Funcionário("321.123.321-12","Julio","91233456",1300.);
        func2.setCargoFuncionário(atend);
 //===============================================================================================================================================================================

        ContaCorrente cor1 = new ContaCorrente("321",7400.,8400.);
        ContaPoupanca cor2 = new ContaPoupanca("123",1000. , 2000.);

        cor1.transferir(cor1, cor2, 100.);

        System.out.println("Conta: "+ cor1.getNumero()+" Saldo: " +  +cor1.getValorBolso());
        System.out.println("Conta: "+ cor2.getNumero()+" Saldo: " +  +cor2.getValorBolso());

//===============================================================================================================================================================================

        ContaCorrente cor3 = new ContaCorrente("854", 0.,0.);

        Credito crd1 = new Credito(100.);
        Credito crd2 = new Credito(100.);
        Credito crd3 = new Credito(100.);
        cor3.credito.add(crd1);
        cor3.credito.add(crd2);
        cor3.credito.add(crd3);

        Debito dbd1 = new Debito(50.);


        cor3.depositar(crd1);
        cor3.depositar(crd2);
        cor3.depositar(crd3);
        cor3.sacar(dbd1);
        System.out.println("Conta: "+ cor3.getNumero()+" Saldo: " + cor3.getValorBolso());
//=========================================================================================================================================================================================
        Cliente cl2 = new Cliente("782.934.648-64","Josias","84758393745");
        cl2.listaConta.add(cor1);
        cl2.listaConta.add(cor2);
        cl1.listaConta.add(cor3);
    }
}
