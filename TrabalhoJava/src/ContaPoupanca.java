public class ContaPoupanca extends Conta{
    private Double rentabilidade;

    public ContaPoupanca(String numero, Double valorBolso, Double rentabilidade) {
        super(numero, valorBolso);
        this.setRentabilidade(rentabilidade);
    }

    public Double calcularSaldo(ContaPoupanca conta){
        Double total = conta.getValorBolso();




        for (Debito e : debito){
            total -= e.getValor();

        }
        for (Credito e : credito){
            total += e.getValor();
        }

        return total;
    }

    public Double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(Double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
}
