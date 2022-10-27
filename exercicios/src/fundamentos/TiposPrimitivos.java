package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {

        // tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_324_845_223L; // informando que o tipo primitivo é long e nao int

        // tipos numéricos reais
        float salario = 11_445.44F; // informando ao Java que esse numero é um literal float e nao um double por ser pequeno
        double vendasAcumuladas = 2_991_797_103.01;

        // tipo boolean
        boolean estaDeFerias = false; // true

        //tipo caractere
        char status = '1'; // ativo

        // dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // numero de viagens
        System.out.println(numeroDeVoos / 2);

        // pontos por real ele ganhou
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Ferias? " + estaDeFerias);
        System.out.println("Status: " + status);

    }
}
