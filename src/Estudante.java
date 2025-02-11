public class Estudante {
    private String nome;
    private double[] notas;

    public Estudante(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.notas = new double[]{nota1, nota2, nota3};
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public boolean foiAprovado() {
        return calcularMedia() >= 60.0;
    }

    public double pontosNecessarios() {
        return Math.max(0, 60.0 - calcularMedia());
    }
}