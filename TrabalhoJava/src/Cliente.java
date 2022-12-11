import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Pessoa implements IUser {
    private Boolean vip;

    public Collection<Endereço> listaEndereço = new ArrayList<Endereço>();
    public Collection<Conta> listaConta = new ArrayList<Conta>();

    public Cliente(String cpf, String nome, String telefone) {
        super(cpf, nome, telefone);
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    @Override
    public Boolean autenticar() {
        return true;
    }

    public void imprimirEndereco(Cliente e) {

        Collection<Endereço> enderecoCliente = e.listaEndereço;

        for (Endereço i : enderecoCliente) {

            System.out.println("Cliente " + e.getNome() + " mora na Cidade: " + i.getCidade() + " CEP: " + i.getCep());

        }
    }
}