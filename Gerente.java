public class Gerente extends Funcionario{
    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public double calcularSalario() {
        return 2300;
    }

    @Override
    public String descreverResponsabilidades() {
        return "gerenciar";
    }
}
