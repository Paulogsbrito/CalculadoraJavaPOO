import java.util.List;

public class CalculadoraJAVA {

    private HistoricoOperacoes historico = new HistoricoOperacoes();

    public double somar(double a, double b) {
        double resultado = a + b;
        historico.adicionarOperacao(a + "+" + b + "=" + resultado);
        return resultado;
    }

    public double subtrair(double a, double b) {
        double resultado = a - b;
        historico.adicionarOperacao(a + "-" + b + "=" + resultado);
        return resultado;

    }

    public double multiplicar(double a, double b) {
        double resultado = a * b;
        historico.adicionarOperacao(a + "*" + b + "=" + resultado);
        return resultado;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            historico.adicionarOperacao(a + " / " + b + " = Erro: Divisão por Zero não é permitida!!!");
            return Double.NaN;
        }

        double resultado = a / b;
        historico.adicionarOperacao(a + "/" + b + "=" + resultado);
        return resultado;

    }

    public void mostrarHistorico() {
        historico.mostrar();
    }

    public List<String> getHistorico() {
        return historico.getOperacoes();
    }

}
