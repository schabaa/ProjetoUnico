public class FormaRetangular {
    private double comprimento;
    private double largura;

    public FormaRetangular(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double obterArea() {
        return comprimento * largura;
    }

    public double obterPerimetro() {
        return 2 * (comprimento + largura);
    }

    public double obterDiagonal() {
        return Math.sqrt(Math.pow(comprimento, 2) + Math.pow(largura, 2));
    }
}