public class SistemaRH {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Fernanda");

        System.out.println("---------------------------");
        System.out.println("O nome do gerente é: ");
        System.out.println(gerente.getNome());
        System.out.println("---------------------------");
        System.out.println("O salário do gerente é: ");
        System.out.println(gerente.calcularSalario());
        System.out.println("---------------------------");
        System.out.println("A responsabilidade do gerente é: ");
        System.out.println(gerente.descreverResponsabilidades());
        System.out.println("---------------------------");
        System.out.println("O nome do desenvolvedor é: ");
        System.out.println(desenvolvedor.getNome());
        System.out.println("---------------------------");
        System.out.println("O salário do desenvolvedor: ");
        System.out.println(desenvolvedor.calcularSalario());
        System.out.println("---------------------------");
        System.out.println("A responsabilidade do desenvolvedor: ");
        System.out.println(desenvolvedor.descreverResponsabilidades());
        System.out.println("---------------------------");


    }
}
