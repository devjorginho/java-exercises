import java.util.Scanner;

public class Calculadora {
    public void calcular() {

        int n1, n2, result;
        char op;

        result = 0;
        System.out.println("Escreva o primeiro número:");
        Scanner input = new Scanner(System.in);
        if(!input.hasNextInt())
        {
            System.out.println("Por favor escreva um numero inteiro valido");
            return ;
        }
        n1 = input.nextInt();
        System.out.printf("Escolha seu operador:");
        op = input.next().charAt(0);
        if(op != '+' && op != '-' && op != '*' && op != '/')
        {
            System.out.println("Operador invalido !");
            return ;
        }
        if(n1 == 0 && op == '/')
        {
            System.out.println("Zero nao pode ser dividido");
            return ;
        }
        System.out.println("Escreva o segundo numero:");
        if(!input.hasNextInt())
        {
            System.out.println("Por favor escreva um numero inteiro valido");
            return ;
        }
        n2 = input.nextInt();
        switch (op) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
                break;
        }
        System.out.println("The result is: " + result);
        System.out.println(result % 2 == 0 ? result + " is pair" : result + " is odd");
    }
}
