package pt.com.myproject.main;
import pt.com.myproject.model.Pessoa;

public class Main {
        public static void main(String[] args) {

            Pessoa pessoa1 = new Pessoa("Jorge", 29);
            Pessoa pessoa2 = new Pessoa("Witória", 29);
            Pessoa pessoa3 = new Pessoa("Janilton", 35);
            pessoa1.apresentar();
            pessoa2.apresentar();
            System.out.println();
            System.out.println("o nome da pessoa 1 é " + pessoa1.getNome());
            System.out.println("o nome da pessoa 2 é " + pessoa2.getNome());
            System.out.println();
            System.out.println("a idade da pessoa 1 é " + pessoa1.getIdade());
            System.out.println("a idade da pessoa 2 é " + pessoa2.getIdade());
            System.out.println();
            pessoa1.setIdade(30);
            pessoa2.setIdade(30);
            System.out.println("A pessoa 1 fará " + pessoa1.getIdade() + " esse ano");
            System.out.println("A pessoa 2 fará " + pessoa2.getIdade() + " só próximo ano");

            System.out.println(pessoa3.getNome());
            System.out.println(pessoa3.getIdade());
            pessoa3.setNome("Alauberto");
            pessoa3.setIdade(2);
            System.out.println(pessoa3.getNome());
            System.out.println(pessoa3.getIdade());
        }
}
