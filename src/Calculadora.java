
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculadoraJAVA calculadora = new CalculadoraJAVA();
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("--- Bem vindo a Calculadora (Versão POO) ---");

                System.out.println("Digite o Primeiro Número:  ");
                double numero1 = leitor.nextDouble();

                System.out.println("Digite o Operador: +, - , *, / ");
                char operador = leitor.next().charAt(0);

                System.out.println("Digite o Segundo Número: ");
                double numero2 = leitor.nextDouble();

                double resultado = 0.0;
                boolean operacaoValida = true;

                switch (operador) {
                    case '+':
                        resultado = calculadora.somar(numero1, numero2);
                        break;

                    case '-':
                        resultado = calculadora.subtrair(numero1, numero2);
                        break;

                    case '*':
                        resultado = calculadora.multiplicar(numero1, numero2);
                        break;

                    case '/':
                        resultado = calculadora.dividir(numero1, numero2);
                        if (Double.isNaN(resultado)) {
                            operacaoValida = false;
                        }
                        break;
                    default:
                        System.out.println("Operador invalido!!!Por gentileza utilize os seguintes operadores:" +
                                "+,-,*,?");
                        operacaoValida = false;
                        resultado = 0;
                        break;
                }

                if (operacaoValida) {
                    System.out.println("O resultado é: " + resultado);
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada invalida!Por gentileza digite apenas números");
                leitor.next();
                continue;
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
                continue;
            }


            System.out.println("Deseja realizar um outro calculo? (SIM/NÃO): ");
            String resposta = leitor.next();

            if (!resposta.equalsIgnoreCase("SIM")) {
                continuar = false;
            }

        }
        leitor.close();
        System.out.println("Calculadora Encerrada, Obrigado!");
        calculadora.mostrarHistorico();

    }
}
