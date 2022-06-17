import java.util.ArrayList;

public class FibonacciMain {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        fibonacci.verificaSeNumeroPertenceASequencia(0);
        fibonacci.verificaSeNumeroPertenceASequencia(1);
        fibonacci.verificaSeNumeroPertenceASequencia(2);
        fibonacci.verificaSeNumeroPertenceASequencia(3);
        fibonacci.verificaSeNumeroPertenceASequencia(4);
        fibonacci.verificaSeNumeroPertenceASequencia(8);
        fibonacci.verificaSeNumeroPertenceASequencia(10);
        fibonacci.verificaSeNumeroPertenceASequencia(21);
        fibonacci.verificaSeNumeroPertenceASequencia(33);
        fibonacci.verificaSeNumeroPertenceASequencia(79);
        fibonacci.verificaSeNumeroPertenceASequencia(88);

    }
}


/*  Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos
2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
escreva um programa na linguagem que desejar onde,
informado um número, ele calcule a sequência de Fibonacci e
 retorne uma mensagem avisando se o número informado pertence ou não a sequência. */