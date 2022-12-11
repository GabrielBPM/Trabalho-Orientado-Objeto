public class Funcionário extends Pessoa implements IUser {

    private Double salario;
    private Cargo cargoFuncionário;

    public Funcionário(String cpf, String nome, String telefone, Double salario) {
        super(cpf, nome, telefone);
        this.setSalario(salario);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Cargo getCargoFuncionário() {
        return cargoFuncionário;
    }

    public void setCargoFuncionário(Cargo cargoFuncionário) {
        this.cargoFuncionário = cargoFuncionário;
    }

    @Override
    public Boolean autenticar() {
        return true;
    }
}
