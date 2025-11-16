package ListaXII;

public class TesteHeranca {

    public static void main(String[] args) {

        
        Pessoa p1 = new Pessoa("Ana Clara", "111.222.333-44", 28);

       
        Funcionario f1 = new Funcionario("Carlos Silva", "222.333.444-55", 35, 3000.00, "Analista");

        
        Gerente g1 = new Gerente("Fernanda Costa", "333.444.555-66", 40, 8000.00, "Gerente", "TI");

        
        System.out.println("=== Dados da Pessoa ===");
        p1.exibirDadosBasicos();

        System.out.println("\n=== Dados do Funcionário ===");
        f1.exibirDadosBasicos();
        System.out.println("Salário anual: " + f1.calcularSalarioAnual());

        System.out.println("\n=== Dados do Gerente ===");
        g1.exibirDadosBasicos();
        System.out.println("Salário anual: " + g1.calcularSalarioAnual());
    }
}
