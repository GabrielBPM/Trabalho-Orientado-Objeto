import java.util.ArrayList;
import java.util.Collection;

public class Conta {
    private String numero;
    private Double valorBolso;
    public Collection<Debito> debito = new ArrayList<Debito>();
    public Collection<Credito> credito = new ArrayList<Credito>();

    public Conta(String numero, Double valorBolso) {
        this.numero = numero;
        this.valorBolso = valorBolso;

    }

    public Double depositar(Credito valorDepositado) {

        this.valorBolso += valorDepositado.getValor();

        return this.valorBolso;
    }

    public Double sacar(Debito valorSacado) {
        if (valorSacado.getValor() > this.valorBolso) {

            System.out.println("Saldo Insuficiente para Saque" + numero);
            return this.valorBolso;
        }
        this.valorBolso -= valorSacado.getValor();

        return this.valorBolso;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getValorBolso() {
        return valorBolso;
    }

    public void setValorBolso(Double valorBolso) {
        this.valorBolso = valorBolso;
    }
}
