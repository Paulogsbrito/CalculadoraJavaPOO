import java.util.ArrayList;
import java.util.List;

public class HistoricoOperacoes {
    private List<String> operacoes = new ArrayList<>();

    public void adicionarOperacao(String operacao) {
        operacoes.add(operacao);
    }

    public void mostrar() {
        if (operacoes.isEmpty()) {
            System.out.println("--- Histórico Vazio ---");
        } else {
            System.out.println("--- Histórico ---");
            operacoes.forEach(System.out::println);

        }
    }

    public List<String> getOperacoes() {
        return operacoes;
    }

}
