import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.calcular();
        Tabuada tabuada = new Tabuada();
        System.out.println("Digite um numero para ver a tabuada");
        Scanner input = new Scanner(System.in);
        if(!input.hasNextInt()) {
            System.out.println("ERRO ! Digite um número inteiro");
            return ;
        }
        int numeroDigitado = input.nextInt();
        if(numeroDigitado < 0 || numeroDigitado > 10) {
            System.out.println("Por favor digite um numero de 0 a 10");
        }
        tabuada.verTabuada(numeroDigitado);
    }
}