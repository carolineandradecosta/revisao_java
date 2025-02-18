package Desafio4;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("A tabuada de multiplicação do " + numero + " é: ");
        for(int i=0; i <=10; i++){
            int resultado = numero * i;
            System.out.println(i + " x " + numero + " = " + resultado);
        }
    }
}
