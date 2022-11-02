package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(0));

        String s = "Boa tarde";
        System.out.println(s.concat("!"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase("boa tarde"));


        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.97;

        System.out.printf("Nome: %s %s que tem idade %d e salario %.2f", nome, sobrenome, idade, salario);

        String frase = String.format("\nNome: %s %s que tem idade %d e salario %.2f", nome, sobrenome, idade, salario);

        System.out.println(frase);
    }
}
