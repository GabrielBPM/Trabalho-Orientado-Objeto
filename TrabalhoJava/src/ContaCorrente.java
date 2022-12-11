public class ContaCorrente extends Conta{
    private Double limite;

    public ContaCorrente(String numero, Double valorBolso, Double limite) {
        super(numero, valorBolso);
        this.setLimite(limite);
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Object transferir(Conta contaOrigem, Conta contaDestino, Double valor) {
       Object[] i = {contaOrigem, contaDestino};

        if(valor > contaOrigem.getValorBolso()) {

            System.out.println("Saldo Insuficiente");
       return i;
        }


contaDestino.setValorBolso(contaDestino.getValorBolso() + valor);
contaOrigem.setValorBolso(contaOrigem.getValorBolso() - valor);

        return i;


    }

    public Double calcularSaldo(ContaCorrente conta){
        Double total = conta.getValorBolso();




        for (Debito e : debito){
            total -= e.getValor();

        }
        for (Credito e : credito){
            total += e.getValor();
        }

        return total + limite;
    }
}

