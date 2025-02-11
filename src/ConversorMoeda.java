public class ConversorMoeda {
    private double taxaCambio;

    public ConversorMoeda(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    public double converterParaReais(double valorDolar) {
        return valorDolar * taxaCambio;
    }
}