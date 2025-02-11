public class Trabalhador {
    private String nome;
    private double salarioBase;
    private double taxaImposto;

    public Trabalhador(String nome, double salarioBase, double taxaImposto) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.taxaImposto = taxaImposto;
    }

    public double calcularSalarioLiquido() {
        return salarioBase - (salarioBase * taxaImposto / 100);
    }

    public void ajustarSalario(double percentualAumento) {
        salarioBase += salarioBase * percentualAumento / 100;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Salário Líquido: R$ %.2f", nome, calcularSalarioLiquido());
    }
}