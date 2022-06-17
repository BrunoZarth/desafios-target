import java.util.ArrayList;

public class Fibonacci {
    private ArrayList<Integer> sequenciaFibonacci = new ArrayList<Integer>();
    private int ultimoDaLista, penultimoDaLista, valorUltimoDaLista;

    public Fibonacci(){
        this.sequenciaFibonacci.add(0);
        this.sequenciaFibonacci.add(1);
        this.ultimoDaLista = sequenciaFibonacci.size() - 1;
        this.penultimoDaLista = sequenciaFibonacci.size() - 2;
        this.valorUltimoDaLista = sequenciaFibonacci.get(ultimoDaLista);
    }

    private void adicionaProximoElemento(){
        this.ultimoDaLista = sequenciaFibonacci.size() - 1;
        this.penultimoDaLista = sequenciaFibonacci.size() - 2;
        int valorProximoElemento = sequenciaFibonacci.get(ultimoDaLista) + sequenciaFibonacci.get(penultimoDaLista);
        this.sequenciaFibonacci.add(valorProximoElemento);
        this.valorUltimoDaLista = sequenciaFibonacci.get(ultimoDaLista);
    }

    public void verificaSeNumeroPertenceASequencia(int numeroInformado){
        if(numeroInformado == 0 || numeroInformado == 1){
            System.out.println("O número " + numeroInformado + " pertence à sequencia de Fibonacci");
        }
        while(numeroInformado > this.valorUltimoDaLista) {
            this.adicionaProximoElemento();
            if (this.valorUltimoDaLista == numeroInformado) {
                System.out.println("O número " + numeroInformado + " pertence à sequencia de Fibonacci");
            }
        }
        if(numeroInformado != this.valorUltimoDaLista){
            System.out.println("O número " + numeroInformado + " NÃO pertence à sequencia de Fibonacci");
        }
    }
}
