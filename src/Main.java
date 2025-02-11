import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problema "FormaRetangular"
        System.out.println("Digite o comprimento e a largura da forma retangular:");
        double comprimento = sc.nextDouble();
        double largura = sc.nextDouble();
        FormaRetangular forma = new FormaRetangular(comprimento, largura);
        System.out.printf("Área: %.2f%n", forma.obterArea());
        System.out.printf("Perímetro: %.2f%n", forma.obterPerimetro());
        System.out.printf("Diagonal: %.2f%n", forma.obterDiagonal());

        // Problema "Trabalhador"
        System.out.println("\nNome do trabalhador:");
        sc.nextLine(); // Consumir quebra de linha
        String nomeTrabalhador = sc.nextLine();
        System.out.println("Salário base:");
        double salarioBase = sc.nextDouble();
        System.out.println("Taxa de imposto (%):");
        double taxaImposto = sc.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, salarioBase, taxaImposto);
        System.out.println("Dados do trabalhador: " + trabalhador);
        System.out.println("Qual o percentual de aumento salarial?");
        double percentualAumento = sc.nextDouble();
        trabalhador.ajustarSalario(percentualAumento);
        System.out.println("Dados atualizados: " + trabalhador);

        // Problema "Estudante"
        System.out.println("\nNome do estudante:");
        sc.nextLine(); // Consumir quebra de linha
        String nomeEstudante = sc.nextLine();
        System.out.println("Digite as três notas do estudante:");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        Estudante estudante = new Estudante(nomeEstudante, nota1, nota2, nota3);
        System.out.printf("Média: %.2f%n", estudante.calcularMedia());
        if (estudante.foiAprovado()) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.printf("Situação: REPROVADO%nPontos necessários: %.2f%n", estudante.pontosNecessarios());
        }

        // Problema "ConversorMoeda"
        System.out.println("\nTaxa de câmbio (valor do dólar em reais):");
        double taxaCambio = sc.nextDouble();
        System.out.println("Quantidade em dólares:");
        double valorDolar = sc.nextDouble();
        ConversorMoeda conversor = new ConversorMoeda(taxaCambio);
        System.out.printf("Valor em reais: R$ %.2f%n", conversor.converterParaReais(valorDolar));

        sc.close();
    }
}